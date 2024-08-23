package P5AdapterPattern;

public class BikeAdapter implements Car {
    private Bike bike;
    public BikeAdapter(Bike _bike){
        bike = _bike;
    }
    @Override
    public void StartCar() {
        bike.StartBike();
    }

    @Override
    public void AccelerateCar() {
        bike.AccelerateBike();
    }
}
