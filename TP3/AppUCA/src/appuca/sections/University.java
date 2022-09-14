/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appuca.sections;

import appuca.datasaving.DataLoader;
import appuca.datasaving.DataSaver;
import appuca.datasaving.Stub;
import appuca.sections.Section;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class University {
    
    private List<Section> sections = new ArrayList<>();
    
    public List<Section> getSections() {
        return Collections.unmodifiableList(sections);
    }
    
    public void loadStub() {
        Stub stub = new Stub();
        this.sections = stub.load();
    }
    
    public void loadData() {
        DataLoader loader = new DataLoader();
        try {
            this.sections = loader.load();
        } catch (IOException e) {
            System.err.println("\nIssue while loading datas ;( " + e);
        } catch (ClassNotFoundException e) {
            System.err.println("The dev sucks " + e);
        }
    }
    
    public void saveData() {
        DataSaver saver = new DataSaver();
        try {
            saver.save(this.sections);
        } catch (IOException e) {
            System.err.println("\nIssue while saving datas ;( " + e);
        }
    }
}
