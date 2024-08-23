package P5AdapterPattern;

public class CarController {
    private final Car AccessedCar;

    public CarController(Car newCar){
        AccessedCar = newCar;
    }

    public void Start(){
        AccessedCar.StartCar();
    }
    public void Accelerate(){
        AccessedCar.AccelerateCar();
    }

    public void runCheck(){
        Start();
        Accelerate();
    }
}
