public class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {

    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (this.hasWorkToDo) {
            System.out.println("Food is being ordered");
            this.hasWorkToDo = false;
//        } else {
//            System.out.println("Nothing needed to order");
        }
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

}
