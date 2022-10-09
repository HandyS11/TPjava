package texteditor.data;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataSaver implements IDataSaver {
    
    private String fileName;
    
    public DataSaver(String fileName) {
        this.fileName = fileName;
    }
    
    @Override
    public void save(List<String> datas) throws IOException {
        try (FileWriter w = new FileWriter(fileName)) {
            for (String data : datas) {
                w.write(data + "\n");
            }
        }
    }
}
