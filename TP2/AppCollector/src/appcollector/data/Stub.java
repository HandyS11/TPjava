package appcollector.data;

import appcollector.collection.Animal;
import appcollector.collection.Fish;
import appcollector.collection.Mammal;

import java.util.ArrayList;
import java.util.List;

public class Stub implements IDataLoader {

    @Override
    public List<Animal> load() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Mammal("Lion", "Male", 250, 2.5, 50, 150, 4));
        animals.add(new Mammal("Horse", "Female", 350, 2.5, 50, 175, 4));
        animals.add(new Fish("Pufferfish", "Female", 0.3, 0.1, 5, 75, 0));
        animals.add(new Fish("Cod", "Male", 0.8, 0.2, 20, 50, 300));
        return animals;
    }
}
