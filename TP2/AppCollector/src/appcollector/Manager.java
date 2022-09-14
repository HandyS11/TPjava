/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcollector;

import appcollector.collection.Animal;
import appcollector.collection.Fish;
import appcollector.collection.Mammal;
import appcollector.utils.KeyboardReader;
import appcollector.utils.Renderer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Manager {
    
    private static Renderer renderer = new Renderer();
    private static KeyboardReader keyboardReader = new KeyboardReader();
    private List<Animal> animals = new ArrayList<>();
    
    public Renderer getRenderer() {
        return renderer;
    }
    
    public KeyboardReader getKeyboardReader() {
        return keyboardReader;
    }
    
    
    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }
    
    public void addAnimal() {
        renderer.printText("\n\nYou will now add an annimal, please fill the field.");
        renderer.showCategories();
        
        int opt = keyboardReader.getIntInput();
        switch(opt) {
            case 1 -> {
                this.createMammal();
            }
            case 2 -> {
                this.createFish();
            }
        }
    }
    
    private Mammal createMammal() {
        return null;
    }
    
    private Fish createFish() {
        return null;
    }
    
    public void createStub() {
        try {
            animals.add(new Mammal("Lion", "Male", 250, 2.5, 50, 150, 4));
            animals.add(new Mammal("Horse", "Female", 350, 2.5, 50, 175, 4));
            animals.add(new Fish("Pufferfish", "Female", 0.3, 0.1, 5, 75, 0));
            animals.add(new Fish("Cod", "Male", 0.8, 0.2, 20, 50, 300));
        }
        catch(Exception e) {
            System.err.println(e);
        }
    }
}
