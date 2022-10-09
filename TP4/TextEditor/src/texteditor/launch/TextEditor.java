package texteditor.launch;

import java.io.IOException;

import texteditor.data.*;
import texteditor.model.MyFile;
import texteditor.utils.KeyboardReader;
import texteditor.utils.Renderer;

public class TextEditor {

    public static void main(String[] args) {

        Renderer renderer = new Renderer();
        KeyboardReader keyboardReader = new KeyboardReader();

        MyFile myFile = new MyFile();
        
        String file = "myFile";
        IDataLoader dataLoader = new DataLoader(file); //new Stub();
        IDataSaver dataSaver = new DataSaver(file);
        
        try {
            myFile.setMyFile(dataLoader.load());
        } catch (IOException e) {
            System.err.println("Error while loading datas! " + e);
        }

        renderer.printText("Launching..\n");

        String opt = "";
        boolean quit = false;
        while(!quit) {
            renderer.printMyFile(myFile.getMyFile());
            opt = keyboardReader.getData("\nAction: ");
            switch(opt) {
                case "i" -> {
                    int line = keyboardReader.getIntInput();
                    String data = keyboardReader.getData("\nData: ");
                    myFile.editLine(line, data);
                }
                case "q" -> {
                    quit = true;
                }
                case "wq" -> {
                    try {
                        dataSaver.save(myFile.getMyFile());
                        quit = true;
                    } catch (IOException e) {
                        System.err.println("Error while saving datas! " + e);
                    }                   
                }
                default -> {
                    renderer.printText("This option does not exist!");
                }
            }
        }   
        renderer.printText("Closing..");
    }    
}
