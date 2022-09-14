/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applidocteur.modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Manager {
    
    private List<Patient> patients = new ArrayList<>();
    
    public void createPatient(String firstName, String lastName) {
        patients.add(new Patient(firstName, lastName));
    }
    
    public void findPatient(String str) {
        
    }
    
    public List<Patient> getPatients() {
        return Collections.unmodifiableList(patients);
    }
    
    public void createStub() {
        try {
            patients.add(new Patient("Mathis", "Ribemont"));
            patients.add(new Patient("Valentin", "Clergue"));
            patients.add(new Patient("Cédric", "Bouhours"));
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
}
