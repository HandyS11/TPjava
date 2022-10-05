package applidocteur.modele;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
    
    private List<Patient> patients = new ArrayList<>();
    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addPatients(List<Patient> patients) {
        this.patients.addAll(patients);
    }
    
    public List<Patient> getPatients() {
        return Collections.unmodifiableList(patients);
    }
}
