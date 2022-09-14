/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcollector.utils;

import appcollector.collection.Animal;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Renderer {
    
    public void showMenu() {
        System.out.println("\n\n#-------------------#");
        System.out.println("# Show species  (1) #");
        System.out.println("# Add animal    (2) #");
        System.out.println("#-------------------#");
        System.out.println("# Leave         (0) #");
        System.out.println("#-------------------#");
        System.out.print("# Choice: ");
    }
    
    public void showCategories() {
        System.out.println("\n\n#-------------------#");
        System.out.println("# Mammal        (1) #");
        System.out.println("# Fish          (2) #");
        System.out.println("#-------------------#");
        System.out.print("# Choice: ");
    }
    
    public void showAnimals(List<Animal> animals) {
        System.out.println("");
        animals.forEach((e) -> {
            System.out.println(e.toString());
        });
    }
    
    public void printText(String str) {
        System.out.println(str);
    }
}
