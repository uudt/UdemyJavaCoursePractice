public class DishWasher {

    private boolean hasWorkToDo;

    public DishWasher() {

    }

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (this.hasWorkToDo) {
            System.out.println("Dishes are being washed");
            this.hasWorkToDo = false;
//        } else {
//            System.out.println("Nothing to wash");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
