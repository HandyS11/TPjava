package appuca.datasaving;

import appuca.sections.Section;
import java.io.IOException;
import java.util.List;

public interface IDataLoader {
    
    List<Section> load() throws IOException, ClassNotFoundException;
}
