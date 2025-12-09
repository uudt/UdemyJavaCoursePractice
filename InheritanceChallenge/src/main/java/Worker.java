public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int age = 2025 - Integer.parseInt(birthDate.substring(6));
        return age;
    }

    public double collectPay() {
//        double paid = 30.0 * 1000;
//        System.out.println("Salary amount $" + paid + " is paid");
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
//        System.out.println("I'm sorry to announce that your contract will be terminated from " + endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
            "name='" + name + '\'' +
            ", birthDate='" + birthDate + '\'' +
            ", endDate='" + endDate + '\'' +
            '}';
    }
}