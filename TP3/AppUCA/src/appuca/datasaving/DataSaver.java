/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appuca.datasaving;

import appuca.sections.Section;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class DataSaver implements IDataSaver {
    
    private final String file = "save.bin";
    
    public void save(List<Section> sections) throws IOException {
        try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(new File(file)))) {
            s.writeObject(sections);
        }
    }
}
