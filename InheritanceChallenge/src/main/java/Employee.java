public class Employee extends Worker {

    private long employeeId;
    private String hiredate;
    private static int employeeNo = 1;

    public Employee(String name, String birthDate, String hiredate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "employeeId=" + employeeId +
            ", hiredate='" + hiredate + '\'' +
            "} " + super.toString();
    }
}
