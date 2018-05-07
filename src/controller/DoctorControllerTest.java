package controller;

import static org.junit.Assert.*;
import model.Patient;
import repository.Repository;
import exceptions.PatientException;
import exceptions.ConsultationException;
import controller.DoctorControllerTest;

public class DoctorControllerTest {

    @org.junit.Test
    public void addPatient() {
        Patient p1 = new Patient("","123","");
        Patient p2 = new Patient("1960408205572","Nick","bla");
        Patient p3 = new Patient("1160408205642","","");
        String patients = "FilePatients.txt";
        String consultations = "FileConsultations.txt";
        Repository r = new Repository(patients,consultations);
        DoctorController c = new DoctorController(r);
        try {
            c.addPatient(p1);
            int result = patients.length();
            assertEquals(result, 1);
            c.addPatient(p2);
            int result2 = patients.length();
            assertEquals(result2,2);
            c.addPatient(p3);
            int result3 = patients.length();
            assertEquals(result3,2);
        } catch(PatientException e) {
            System.out.println(e.getMessage());
        }

    }

    @org.junit.Test
    public void addConsultation() {
    }

    @org.junit.Test
    public void getPatientsWithDisease() {
    }
}