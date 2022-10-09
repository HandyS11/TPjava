package appuca.sections;

import java.io.Serializable;

public abstract class Section implements Serializable {
    
    private String name;
    private int buildingCode;
    private int numberStudent;
    
    Section(String name, int buildingCode, int numberStudent) {
        this.name = name;
        this.buildingCode = buildingCode;
        this.numberStudent = numberStudent;
    }
    
    @Override
    public String toString() {
        return String.format("- %s\tBuilding code: %d\tNumber of students: %d", name, buildingCode, numberStudent);
    }
}
