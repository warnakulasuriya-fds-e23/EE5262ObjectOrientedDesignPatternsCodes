package P6MVCPattern;

public class CarModel {
    public String carName;

    public String fuelType;

    public String horsePower;

    public CarModel(String CarName, String FuelType, String Horsepower){
        this.carName = CarName;
        this.fuelType = FuelType;
        this.horsePower = Horsepower;
    }
    public void printCarModel(){
        System.out.println("Car Name: "+ carName);
        System.out.println("Fuel Type: "+ fuelType);
        System.out.println("Horsepower:" + horsePower);
    }
}
