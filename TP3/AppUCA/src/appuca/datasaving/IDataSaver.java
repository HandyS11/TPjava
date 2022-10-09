package appuca.datasaving;

import appuca.sections.Section;
import java.io.IOException;
import java.util.List;

public interface IDataSaver {
    
    void save(List<Section> sections) throws IOException;
}
