package appcollector.utils;

import appcollector.collection.Animal;
import java.util.List;

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
        System.out.println("\n# Mammal        (1) #");
        System.out.println("# Fish          (2) #");
        System.out.print("\n# Choice: ");
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
