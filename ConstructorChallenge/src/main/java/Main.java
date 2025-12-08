import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Customer cust1 = new Customer("u", 1000, "uudt@gmail.com");
        System.out.println(cust1.getName());
        System.out.println(cust1.getCreditLimit());
        System.out.println(cust1.getEmail());

        Customer cust2 = new Customer("uudt", "uudt@gmail");
        System.out.println(cust2.getName());
        System.out.println(cust2.getCreditLimit());
        System.out.println(cust2.getEmail());

        Customer cust3 = new Customer();
        System.out.println(cust3.getName());
        System.out.println(cust3.getCreditLimit());
        System.out.println(cust3.getEmail());
    }

}
