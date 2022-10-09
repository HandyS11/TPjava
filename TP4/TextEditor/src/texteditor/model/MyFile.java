package texteditor.model;

import java.util.Collections;
import java.util.List;

public class MyFile {
    
    private List<String> datas;

    public MyFile(List<String> datas) {
        this.datas = datas;
    }

    public List<String> getMyFile() {
        return Collections.unmodifiableList(datas);
    }
    
    public void editLine(int line, String data) {
        if (line >= this.datas.size()) {
            for (int i = this.datas.size(); i <= line; i++) {
                this.datas.add((new String("")));
            }
        }
        this.datas.set(line, data);
    }
}
