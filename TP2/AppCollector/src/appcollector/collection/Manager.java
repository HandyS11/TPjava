package appcollector.collection;

import appcollector.utils.KeyboardReader;
import appcollector.utils.Renderer;

import java.util.Collections;
import java.util.List;

public class Manager {

    private List<Animal> animals;

    public Manager(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return Collections.unmodifiableList(animals);
    }
    
    public void addAnimal(Renderer renderer, KeyboardReader keyboardReader) {
        renderer.printText("\n\nYou will now add an animal, please fill the fields.");
        renderer.showCategories();
        
        int opt = keyboardReader.getIntInput();
        switch(opt) {
            case 1 -> createMammal(keyboardReader);
            case 2 -> createFish(keyboardReader);
            default -> renderer.printText("Wrong option, addition abort!");
        }
    }

    // I must find a way to do this more efficiently
    private void createMammal(KeyboardReader keyboardReader) {
        Mammal mammal = new Mammal(keyboardReader.getData("Specie"),
                                keyboardReader.getData("Gender"),
                                keyboardReader.getDouble("Weight"),
                                keyboardReader.getDouble("Length"),
                                keyboardReader.getDouble("Speed"),
                                keyboardReader.getInt("Number of bones"),
                                keyboardReader.getInt("Number of legs")
                );
        animals.add(mammal);
    }

    // Same
    private void createFish(KeyboardReader keyboardReader) {
        Fish fish = new Fish(keyboardReader.getData("Specie"),
                keyboardReader.getData("Gender"),
                keyboardReader.getDouble("Weight"),
                keyboardReader.getDouble("Length"),
                keyboardReader.getDouble("Speed"),
                keyboardReader.getInt("Number of bones"),
                keyboardReader.getInt("Number of tortoiseshell")
        );
        animals.add(fish);
    }
}
