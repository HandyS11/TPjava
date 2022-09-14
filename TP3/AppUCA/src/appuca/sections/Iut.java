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
public class Iut extends Section implements Serializable {
    
    private String buildingStatement;
    
    public Iut(String name, int buildingCode, int numberStudent, String buildingState) {
        super(name, buildingCode, numberStudent);
        this.buildingStatement = buildingState;
    }
    
    @Override
    public String toString() {
       return super.toString() + "\tBuilding state: " + this.buildingStatement;
    }
}
