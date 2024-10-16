package P6MVCPattern;

public class CarDataController {
    public CarStorageService storageService;

    public CarDataController(){
        storageService = new CarStorageService();
    }
    public void addACar(String carName, String fuelType, String horsePower){
        final CarModel newCar = new CarModel(carName,fuelType,horsePower);
        storageService.addCar(newCar);

    }
}
