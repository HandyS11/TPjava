package texteditor.data;

import java.io.IOException;
import java.util.List;

public interface IDataLoader {
    
    List<String> load() throws IOException;
}
