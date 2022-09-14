/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appuca.datasaving;

import appuca.sections.HealfCare;
import appuca.sections.Iut;
import appuca.sections.Section;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Stub implements IDataLoader {
    
    @Override
    public List<Section> load() {
        
        List<Section> data = new ArrayList<>();
        
        data.add(new Iut("Computer Science", 1, 300, "it sucks"));
        data.add(new Iut("Physics", 2, 500, "insane"));
        data.add(new Iut("Biology", 3, 400, "good"));
        
        data.add(new HealfCare("Medecine", 4, 1200, "CHU Clermont"));
        
        return data;
    }
}
