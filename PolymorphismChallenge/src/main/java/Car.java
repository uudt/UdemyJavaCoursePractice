public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> Engine is started");
    }

    public void drive() {
        runEngine();
        System.out.println("Car -> The car drives, type is " + getClass().getSimpleName());
    }

    protected void runEngine() {
        System.out.println("Car -> Engine is run");
    }

}



class GasPoweredCar extends Car {

    private double avgKmPerLitre;
    private int cylindres = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylindres) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylindres = cylindres;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylindres);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> Usage exceeds the average: %.2f %n", avgKmPerLitre);
    }

    //    public void startEngine() {
//        System.out.println("Gas powered car -> Engine is started");
//    }
//
//    public void drive() {
//        runEngine();
//        System.out.println("Gas powered car -> Car drives, type is " + getClass().getSimpleName());
//    }
//
//    protected void runEngine() {
//        System.out.println("Gas powered car -> Engine is run");
//    }
//
//    public void reduceExhausts() {
//        System.out.println("Gas powered car -> harmness is reduced");
//    }
}



class ElectricCar extends Car {

    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Electric -> Switch %d kWh battery on, Ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> Usage under the average: %.2f %n", avgKmPerCharge);
    }
}



class HybridCar extends Car {

    private double avgKmPerLitre;
    private int cylindres = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int cylindres, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylindres = cylindres;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylindres);
        System.out.printf("Hybrid -> Switch %d kWh battery on, Ready! %n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> Usage below the average: %.2f %n", avgKmPerLitre);
    }

}



//class ElectricCar extends Car {
//    private double avgKmPerCharge;
//    private int batterySize;
//
//    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
//        super(description);
//        this.avgKmPerCharge = avgKmPerCharge;
//        this.batterySize = batterySize;
//    }
//
//    public void startEngine() {
//        System.out.println("Electric car -> Engine is started");
//    }
//
//    public void drive() {
//        runEngine();
//        System.out.println("Electric car -> car drives");
//    }
//
//    protected void runEngine() {
//        System.out.println("Electric car -> Engine is run");
//    }
//
//    public void accelerate(int acceleration) {
//        System.out.println("Electric car -> Car is accelerated for " + acceleration + " km/h");
//    }
//
//}
//
//
//class HybridCar extends Car {
//    private double avgKmPerLitre;
//    private int batterySize;
//    private int cylindres;
//
//    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylindres) {
//        super(description);
//        this.avgKmPerLitre = avgKmPerLitre;
//        this.batterySize = batterySize;
//        this.cylindres = cylindres;
//    }
//
//    public void startEngine() {
//        System.out.println("Hybrid car -> Engine is started");
//    }
//
//    public void drive() {
//        runEngine();
//        System.out.println("Hybrid car -> Car drives");
//    }
//
//    protected void runEngine() {
//        System.out.println("Hybrid car -> Engine is run");
//    }
//
//    public void switchMode(boolean electric) {
//        System.out.print("Hybrid car -> Car is switched to ");
//        if (electric) {
//            System.out.println("electric mode");
//        } else {
//            System.out.println("gas powered drive");
//        }
//
//    }
//
//}