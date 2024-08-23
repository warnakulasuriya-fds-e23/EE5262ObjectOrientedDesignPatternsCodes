package P5AdapterPattern;

public class KawasakiNinja implements Bike{
    @Override
    public void StartBike() {
        System.out.println("Started the Kawasaki Ninja Bike");
    }

    @Override
    public void AccelerateBike() {
        System.out.println("Kawasaki Ninja Accelerated");
    }
}
