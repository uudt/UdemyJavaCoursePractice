public class Main {

    public static void main(String[] args) {

        CoffeeMaker brewMaster = new CoffeeMaker(true);
        DishWasher dishWasher = new DishWasher(true);
        Refrigerator iceBox = new Refrigerator(true);

        SmartKitchen smartKitchen = new SmartKitchen(true, true, true);

//        SmartKitchen smartKitchen = new SmartKitchen();
//        smartKitchen.setKitchenState(true, false, true);
        smartKitchen.doKitchenWork();

    }

}
