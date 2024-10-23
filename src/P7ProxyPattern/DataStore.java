package P7ProxyPattern;

import java.util.ArrayList;
import java.util.List;

public interface DataStore {
    public void addData(String data);
    public void deleteData(int index);
    public List<String> fetchAll();

    public void printAll();

}
