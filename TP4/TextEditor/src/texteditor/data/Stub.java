package texteditor.data;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Stub implements IDataLoader {
    
    public List<String> load() throws IOException {
        List<String> l = new ArrayList<>();
        l.add("Le suis la ligne indice 0");
        l.add("Le suis la ligne indice 1");
        l.add("Le suis la ligne indice 2");
        l.add("Le suis la ligne indice 3");
        l.add("Le suis la ligne indice 4");
        return l;
    }
}
