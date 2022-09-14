/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditor.datasaving;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class DataSaver implements IDataSaver {
    
    private String fileName;
    
    public DataSaver(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void save(List<String> datas) throws IOException {
        try (FileWriter w = new FileWriter(new File(fileName))) {
            for (String data : datas) {
                w.write(data + "\n");
            }
        }
    }
}
