package texteditor.utils;

import java.util.List;

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
