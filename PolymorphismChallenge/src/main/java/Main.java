public class Main {

    public static void main(String[] args) {

        Car car = new Car("Just some car");
        GasPoweredCar gasPoweredCar = new GasPoweredCar("Gas powered car Ferrari", 7.5, 6);
        ElectricCar electricCar = new ElectricCar("Electric car Tesla", 450, 250);
        HybridCar hybridCar = new HybridCar("Hybrid car Lamborgini", 35, 150, 2);

        runRace(car);

        runRace(gasPoweredCar);
//        gasPoweredCar.reduceExhausts();
//
        runRace(electricCar);
//        electricCar.accelerate(30);
//
        runRace(hybridCar);
//        hybridCar.switchMode(true);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }

}
