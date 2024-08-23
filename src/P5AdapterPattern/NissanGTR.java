package P5AdapterPattern;

public class NissanGTR implements Car{
    @Override
    public void StartCar() {
        System.out.println("Started Nissan GTR car");
    }

    @Override
    public void AccelerateCar() {
        System.out.println("Accelerated Nissan GTR car");
    }
}
