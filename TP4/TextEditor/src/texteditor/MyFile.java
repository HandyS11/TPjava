/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package texteditor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public class MyFile {
    
    private List<String> datas = new ArrayList<>();
    
    public List<String> getMyFile() {
        return this.datas;
    }
    
    public void setMyFile(List<String> datas) {
        this.datas = datas;
    }
    
    public void editLine(int line, String data) {
        this.datas.set(line, data);
    }
}
