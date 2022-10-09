/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package texteditor.data;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author vaclergue
 */
public interface IDataSaver {
    
    void save(List<String> datas) throws IOException;
}
