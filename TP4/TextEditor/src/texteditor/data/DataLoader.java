/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditor.data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vaclergue
 */
public class DataLoader implements IDataLoader {
    
    private String fileName;
    
    public DataLoader(String fileName) {
        this.fileName = fileName;
    }
    
    public List<String> load() throws IOException {
        List<String> datas = new ArrayList<String>(); 
        try (Scanner s = new Scanner(new File(fileName))) {
            while (s.hasNextLine()) {
                datas.add(s.nextLine());
            }
        }
        return datas;
    }
}
