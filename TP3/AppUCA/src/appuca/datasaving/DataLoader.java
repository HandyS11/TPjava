/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appuca.datasaving;

import appuca.sections.Section;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class DataLoader {
    
    private final String file = "save.bin";
    
    public List<Section> load() throws IOException, ClassNotFoundException {
        try (ObjectInputStream s = new ObjectInputStream(new FileInputStream(new File(file)))) {
            return (List<Section>) s.readObject();
        }
    }
}
