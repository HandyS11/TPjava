/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditor.utils;

import java.util.List;

/**
 *
 * @author vaclergue
 */
public class Renderer { 
    
    public void printText(String str) {
        System.out.print(str);
    }
    
    public void printMyFile(List<String> datas) {
        int i = 0;
        for (String data : datas) {
            System.out.println("[" +  i + "] " + data);
            i++;
        }
    }
}
