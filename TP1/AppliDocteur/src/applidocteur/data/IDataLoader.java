package applidocteur.data;

import applidocteur.modele.Patient;

import java.util.List;

public interface IDataLoader {

    List<Patient> load();
}
