import Bank.BankAccount;

public class Main {
    public static void main(String[] args) {

        //        BankAccount udtAccount = new BankAccount();
//
//        udtAccount.setNumber("1");
//        udtAccount.setBalance(10.0);
//        udtAccount.setName("Ulyana");
//        udtAccount.setEmail("uudt@gmail.com");
//        udtAccount.setPhoneNumber("89815673454");

//        BankAccount udtAccount = new BankAccount("1", 10.0, "Ulyana", "uudt@gmail.com", "89815673454");

        BankAccount udtAccount = new BankAccount();

        System.out.println(udtAccount.getNumber());
        System.out.println(udtAccount.getBalance());

        udtAccount.deposit(1000.0);
        udtAccount.withdraw(1011.0);

        BankAccount uAccount = new BankAccount("123", 100.1, "u");
        System.out.println("AccountNo: " + uAccount.getNumber() + "; name: " + uAccount.getName());
    }

}
