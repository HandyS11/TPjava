package texteditor.data;

import java.io.IOException;
import java.util.List;

public interface IDataSaver {
    
    void save(List<String> datas) throws IOException;
}
