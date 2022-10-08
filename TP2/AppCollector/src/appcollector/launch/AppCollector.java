/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appcollector.launch;

import appcollector.collection.Manager;

/**
 *
 * @author vaclergue
 */
public class AppCollector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Manager manager = new Manager();
        
        manager.getRenderer().printText("Launching...");
        manager.createStub();
        
        int opt = -1;
              
        while(opt != 0) {
            //clear la console
            manager.getRenderer().showMenu();
            opt = manager.getKeyboardReader().getIntInput();
            switch(opt) {
                case 1 -> manager.getRenderer().showAnimals(manager.getAnimals());
                case 2 -> { manager.addAnimal(); }
            }
            manager.getKeyboardReader().waitToGo();       
        }   
        manager.getRenderer().printText("Closing...");
    }
    
}
