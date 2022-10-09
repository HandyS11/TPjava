package appuca.launch;

import appuca.datasaving.*;
import appuca.sections.University;
import appuca.utils.KeyboardReader;
import appuca.utils.Renderer;
import jdk.jshell.spi.ExecutionControl;

import java.io.IOException;

public class AppUCA {

    public static void main(String[] args) {
        
        Renderer renderer = new Renderer();
        KeyboardReader keyboardReader = new KeyboardReader();

        University university;
        IDataLoader dataLoader = new DataLoader(); //new Stub();
        IDataSaver dataSaver = new DataSaver();

        try {
            university = new University(dataLoader.load());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        renderer.printText("Launching..");

        int opt = -1;       
        while(opt != 0) {
            renderer.showMenu();
            opt = keyboardReader.getIntInput();
            switch(opt) {
                case 1 -> renderer.showSections(university.getSections());
                case 2 -> {}
                case 3 -> {
                    try {
                        university.saveData(dataSaver);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }   
        renderer.printText("Closing..");
    }
}
