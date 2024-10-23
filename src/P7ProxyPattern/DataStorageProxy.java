package P7ProxyPattern;

import java.util.List;

public class DataStorageProxy implements DataStore {
    DataStorageSystem sys;
    public DataStorageProxy(){
        sys = new DataStorageSystem();
    }
    @Override
    public void addData(String data) {
        if(!data.isEmpty() && data.length()<=20){
            sys.addData(data);
            System.out.println("Successfully added data");
        } else if (data.isEmpty()) {
            System.out.println("Error! empty data string was provided!");
            System.out.println("No changes made");
        } else{
            System.out.println("You can only insert strings with size <= 20");
            System.out.println("No changes made");
        }
    }

    @Override
    public void deleteData(int index) {
        int currentNumberOfEntries = sys.getCurrentNumberOfEntries();
        if(index==0 || index >= currentNumberOfEntries) {
            System.out.println("Error! Invalid index");
        }
        else{
            sys.deleteData(index);
        }
    }

    @Override
    public List<String> fetchAll() {

        return sys.fetchAll();
    }

    @Override
    public void printAll(){
        sys.printAll();
    }
}
