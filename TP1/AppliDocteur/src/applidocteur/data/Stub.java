package applidocteur.data;

import applidocteur.modele.Patient;

import java.util.ArrayList;
import java.util.List;

public class Stub implements IDataLoader {

    @Override
    public List<Patient> load() {
        List<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Mathis", "Ribemont"));
        patients.add(new Patient("Valentin", "Clergue"));
        patients.add(new Patient("Cédric", "Bouhours"));
        return patients;
    }
}
