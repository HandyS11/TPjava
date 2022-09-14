/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applidocteur.utils;

import applidocteur.modele.Patient;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Renderer {
    
    public void showMenu() {
        System.out.println("\n\n#-------------------#");
        System.out.println("# Add patient   (1) #");
        System.out.println("# Show patients (2) #");
        System.out.println("# Find patient  (3) #");
        System.out.println("#-------------------#");
        System.out.println("# Leave         (0) #");
        System.out.println("#-------------------#");
        System.out.print("# Choice: ");
    }
    
    public void addPatient() {
        
    }
    
    public void showPatients(List<Patient> patients) {
        System.out.println("");
        patients.forEach((e) -> {
            System.out.println(e.toString());
        });
    }
    
    public void findPatient() {
        
    }
}
