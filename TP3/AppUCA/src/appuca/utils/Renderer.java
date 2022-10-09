package appuca.utils;

import appuca.sections.Section;
import java.util.List;

public class Renderer {
    
    public void showMenu() {
        System.out.println("\n\n#-------------------#");
        System.out.println("# Show sections (1) #");
        System.out.println("# Add section   (2) #");
        System.out.println("# Save sections (3) #");
        System.out.println("#-------------------#");
        System.out.println("# Quit          (0) #");
        System.out.println("#-------------------#");
        System.out.print("# Choice: ");
    }
    
    public void printText(String str) {
        System.out.println(str);
    }
    
    public void showSections(List<Section> sections) {
        System.out.println("");
        sections.forEach((e) -> {
            System.out.println(e.toString());
        });
    }
}
