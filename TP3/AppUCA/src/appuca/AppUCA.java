/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appuca;

import appuca.datasaving.Stub;
import appuca.sections.University;
import appuca.utils.KeyboardReader;
import appuca.utils.Renderer;

/**
 *
 * @author vaclergue
 */
public class AppUCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Launching..");
        
        Renderer renderer = new Renderer();
        KeyboardReader keyboardReader = new KeyboardReader();
        University university = new University();
        
        //university.loadStub();
        university.loadData();
        
        int opt = -1;       
        while(opt != 0) {
            //clear la console
            renderer.showMenu();
            opt = keyboardReader.getIntInput();
            switch(opt) {
                case 1 -> { renderer.showSections(university.getSections()); }
                case 2 -> {}
                case 3 -> { university.saveData(); }
            }
            keyboardReader.waitToGo();       
        }   
        System.out.println("\nClosing..");
    }
    
}
