package P5AdapterPattern;

public class Usage {
    public static void main(String[] args) {
        NissanGTR nissan1 = new NissanGTR();
        KawasakiNinja kawasaki1 = new KawasakiNinja();
        BikeAdapter kawasakiAdapter = new BikeAdapter(kawasaki1);

        CarController nissanController = new CarController(nissan1);
        CarController kawasakiController = new CarController(kawasakiAdapter);
        System.out.println("-------------");
        System.out.println("for nissan:");
        nissanController.runCheck();
        System.out.println("-------------");

        System.out.println("-------------");
        System.out.println("for kawasaki");
        kawasakiController.runCheck();
        System.out.println("-------------");
    }
}
