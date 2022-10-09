package appuca.datasaving;

import appuca.sections.Section;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DataLoader implements IDataLoader {
    
    private final String file = "save.bin";
    
    public List<Section> load() throws IOException, ClassNotFoundException {
        try (ObjectInputStream s = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Section>) s.readObject();
        }
    }
}
