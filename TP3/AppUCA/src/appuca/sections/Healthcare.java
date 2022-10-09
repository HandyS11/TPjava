package appuca.sections;

import java.io.Serializable;

public class Healthcare extends Section implements Serializable {
    
    private String hospital;
    
    public Healthcare(String name, int buildingCode, int numberStudent, String hospital) {
        super(name, buildingCode, numberStudent);
        this.hospital = hospital;
    }
    
    @Override
    public String toString() {
       return super.toString() + "\tHospital name: " + this.hospital;
    }
}
