public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        this.brewMaster = new CoffeeMaker();
        this.dishWasher = new DishWasher();
        this.iceBox = new Refrigerator();
    }

    public SmartKitchen(boolean c, boolean d, boolean r) {
        this.brewMaster = new CoffeeMaker(c);
        this.dishWasher = new DishWasher(d);
        this.iceBox = new Refrigerator(r);
    }

    private void addWater(boolean b) {
        this.brewMaster.setHasWorkToDo(b);
    }

    private void pourMilk(boolean p) {
        this.iceBox.setHasWorkToDo(p);
    }

    private void loadDishWasher(boolean l) {
        this.dishWasher.setHasWorkToDo(l);
    }

    public void setKitchenState(boolean coffeeMakerState, boolean dishWasherState,
                                boolean refrigeratorState) {
        addWater(coffeeMakerState);
        loadDishWasher(dishWasherState);
        pourMilk(refrigeratorState);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}
