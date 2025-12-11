public class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {

    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {

        if (this.hasWorkToDo) {
            System.out.println("Brewing Coffee");
            this.hasWorkToDo = false;
//        } else {
//            System.out.println("Nothing to cook");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
