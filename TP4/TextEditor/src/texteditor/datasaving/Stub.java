/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditor.datasaving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Stub implements IDataLoader {
    
    public List<String> load() throws IOException {
        List<String> l = new ArrayList<String>();
        l.add("Le suis la première ligne");
        l.add("Le suis la seconde ligne");
        l.add("Le suis la troisième ligne");
        l.add("Le suis la quatrième ligne");
        l.add("Le suis la cinquième ligne");
        return l;
    }
}
