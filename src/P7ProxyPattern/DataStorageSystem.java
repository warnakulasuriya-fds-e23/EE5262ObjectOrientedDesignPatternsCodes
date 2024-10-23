package P7ProxyPattern;

import java.util.LinkedList;
import java.util.List;

public class DataStorageSystem implements DataStore {
    List<String> DataList;

    public DataStorageSystem(){
        DataList = new LinkedList<String>();
    }
    @Override
    public void addData(String data) {
        DataList.add(data);
    }

    @Override
    public void deleteData(int index) {
        String EntryTobeRemoved = DataList.get(index);
        DataList.remove(index);
        System.out.println("Successfully removed the entry : " + EntryTobeRemoved);
    }

    @Override
    public List<String> fetchAll() {
        return DataList;
    }

    @Override
    public void printAll(){
        for(int i=0; i<DataList.size(); i++){
            System.out.println(i+": "+DataList.get(i));
        }
    }

    public int getCurrentNumberOfEntries(){
        return DataList.size();
    }
}
