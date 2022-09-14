package applidocteur;

import applidocteur.modele.Manager;
import applidocteur.utils.*;

/**
 *
 * @author vaclergue
 */
public class AppliDocteur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Lancement de l'application");
        
        Renderer renderer = new Renderer();
        ChoiceReader choiceReader = new ChoiceReader();
        Manager manager = new Manager();
        manager.createStub();
        
        int opt = -1;
              
        while(opt != 0) {
            //clear la console
            renderer.showMenu();
            opt = choiceReader.getIntInput();
            switch(opt) {
                case 1 -> manager.createPatient(choiceReader.getData("First name"), choiceReader.getData("Last name"));
                case 2 -> renderer.showPatients(manager.getPatients());
                case 3 -> {}
            }
            choiceReader.waitToGo();       
        }   
        System.out.println("\nFermeture de l'application");
    }
}
