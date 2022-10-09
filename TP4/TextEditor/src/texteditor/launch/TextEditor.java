package texteditor.launch;

import java.io.IOException;

import texteditor.model.MyFile;
import texteditor.data.DataLoader;
import texteditor.data.DataSaver;
import texteditor.data.Stub;
import texteditor.utils.KeyboardReader;
import texteditor.utils.Renderer;

public class TextEditor {

    public static void main(String[] args) {
        System.out.println("Launching..");
        
        Renderer renderer = new Renderer();
        KeyboardReader keyboardReader = new KeyboardReader();
        MyFile myFile = new MyFile();
        Stub stub = new Stub();
        
        String file = "myFile";
        DataLoader dataLoader = new DataLoader(file);
        DataSaver dataSaver = new DataSaver(file);
        
        try {
            myFile.setMyFile(stub.load());
            //myFile.setMyFile(dataLoader.load());
        } catch (IOException e) {
            System.err.println("Error while loading datas! " + e);
        }  
        
        String opt = "";
        boolean quit = false;
        while(!quit) {
            //clear la console
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
            keyboardReader.waitToGo(); 
        }   
        System.out.println("\nClosing..");
    }    
}
