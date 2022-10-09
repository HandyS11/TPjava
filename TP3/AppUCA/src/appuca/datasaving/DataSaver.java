package appuca.datasaving;

import appuca.sections.Section;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class DataSaver implements IDataSaver {
    
    private final String file = "save.bin";
    
    public void save(List<Section> sections) throws IOException {
        try (ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream(file))) {
            s.writeObject(sections);
        }
    }
}
