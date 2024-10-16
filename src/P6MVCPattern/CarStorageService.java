package P6MVCPattern;

import java.util.List;

public class CarStorageService {
    public List<CarModel> storedCars;

    public void addCar(CarModel newCar){
        storedCars.add(newCar);
    }

    public void displayAll(){
        for(int i=0; i< storedCars.size(); i++){
            storedCars.get(i).printCarModel();
        }
    }
}
