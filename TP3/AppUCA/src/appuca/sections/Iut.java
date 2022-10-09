package appuca.sections;

import java.io.Serializable;

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
