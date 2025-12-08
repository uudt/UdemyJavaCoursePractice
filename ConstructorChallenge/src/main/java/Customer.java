public class Customer {
    private String name;
    private long creditLimit;
    private String email;


    public Customer() {
        this("nobody", "nobody@gmail");
    }

    public Customer(String name, String email) {
        this(name, 1000000, email);
    }

    public Customer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
