/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applidocteur.modele;


/**
 *
 * @author vaclergue
 */
public class Patient {
    private String firstName;
    private String lastName;   

    Patient(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public String toString() {
        return "- " + this.firstName + " " + this.lastName;
    }
}
