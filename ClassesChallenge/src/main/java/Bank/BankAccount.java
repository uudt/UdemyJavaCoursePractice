package Bank;

public class BankAccount {
    private String number;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("5567", 11.1, "default name", "email", "phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String name, String email, String phoneNumber) {
        System.out.println("Constructor with parameters called");
        this.number = number;
//        setNumber(number);
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String number, double balance, String name) {
        this(number, balance, name, "gmail", "5555555");
        this.number = number;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + this.balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Unsufficient balance to withdraw! Balance is $" + this.balance);
            return;
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal is $" + withdrawalAmount + " proccessed. Remaining amount is $" + this.balance);
//          return this.balance;
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
