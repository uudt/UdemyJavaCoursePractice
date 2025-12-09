public class Main {

    public static void main(String[] args) {

        Employee uu = new Employee("uu", "10.07.1999", "01.08.2024");
        System.out.println(uu);
        System.out.println("Age = " + uu.getAge());
        System.out.println("Pay = " + uu.collectPay());

        SalariedEmployee uudt = new SalariedEmployee("uudt", "11.07.2001", "02.08.2025", 30000);
        System.out.println(uudt);
        System.out.println("Age = " + uudt.getAge());
        System.out.println("Uudt's paycheck = $" + uudt.collectPay());

        uudt.retire();
        System.out.println("Uudt's pension check = $" + uudt.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05.05.2000",
            "10.10.2020", 15);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's holiday pay = $" + mary.getDoublePay());

    }
}
