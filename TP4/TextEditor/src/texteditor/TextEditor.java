/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package texteditor;

import java.io.IOException;
import texteditor.datasaving.DataLoader;
import texteditor.datasaving.DataSaver;
import texteditor.datasaving.Stub;
import texteditor.utils.KeyboardReader;
import texteditor.utils.Renderer;

/**
 *
 * @author vaclergue
 */
public class TextEditor {

    /**
     * @param args the command line arguments
     */
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
