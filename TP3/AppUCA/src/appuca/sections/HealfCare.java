/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appuca.sections;

import java.io.Serializable;

/**
 *
 * @author vaclergue
 */
public class HealfCare extends Section implements Serializable {
    
    private String hospital;
    
    public HealfCare(String name, int buildingCode, int numberStudent, String hospital) {
        super(name, buildingCode, numberStudent);
        this.hospital = hospital;
    }
    
    @Override
    public String toString() {
       return super.toString() + "\tHospital name: " + this.hospital;
    }
}
