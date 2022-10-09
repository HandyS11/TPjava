package appuca.sections;

import appuca.datasaving.IDataSaver;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class University {
    
    private List<Section> sections;

    public University(List<Section> sections) {
        this.sections = sections;
    }

    public List<Section> getSections() {
        return Collections.unmodifiableList(sections);
    }

    public void saveData(IDataSaver dataSaver) throws IOException {
        dataSaver.save(sections);
    }
}
