package applidocteur.launch;

import applidocteur.data.IDataLoader;
import applidocteur.data.Stub;
import applidocteur.modele.Manager;
import applidocteur.modele.Patient;
import applidocteur.utils.ChoiceReader;
import applidocteur.utils.Renderer;

public class AppliDocteur {
    
    public static void main(String[] args) {
        System.out.println("Launching App");
        
        Renderer renderer = new Renderer();
        ChoiceReader choiceReader = new ChoiceReader();
        IDataLoader dataLoader = new Stub();
        Manager manager = new Manager();
        manager.addPatients(dataLoader.load());
        
        int opt = -1;
              
        while(opt != 0) {
            renderer.showMenu();
            opt = choiceReader.getIntInput();
            switch(opt) {
                case 1 -> {
                    manager.addPatient(new Patient(choiceReader.getData("First name"), choiceReader.getData("Last name")));
                }
                case 2 -> renderer.showPatients(manager.getPatients());
                case 3 -> {}
            }
        }   
        System.out.println("\nClosing App");
    }
}
