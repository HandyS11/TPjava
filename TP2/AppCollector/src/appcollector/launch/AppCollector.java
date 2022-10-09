package appcollector.launch;

import appcollector.collection.Manager;
import appcollector.data.IDataloader;
import appcollector.data.Stub;
import appcollector.utils.KeyboardReader;
import appcollector.utils.Renderer;

public class AppCollector {

    public static void main(String[] args) {

        IDataloader dataLoader = new Stub();
        Manager manager = new Manager(dataLoader.load());
        Renderer renderer = new Renderer();
        KeyboardReader keyboardReader = new KeyboardReader();

        renderer.printText("Launching...");
        
        int opt = -1;
              
        while(opt != 0) {
            renderer.showMenu();
            opt = keyboardReader.getIntInput();
            switch(opt) {
                case 1 -> renderer.showAnimals(manager.getAnimals());
                case 2 -> manager.addAnimal(renderer, keyboardReader);
            }
        }
        renderer.printText("Closing...");
    }
    
}
