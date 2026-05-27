package dev.uudt;

import dev.uudt.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Misha", "K", 2020));
        employees.add(new Employee("Vasya", "V", 2025));
        employees.add(new Employee("Tolya", "M", 2018));
        employees.add(new Employee("Olya", "G", 2014));
        employees.add(new Employee("Polina", "R", 2020));

        calculateFields(employees);
    }

    public static void calculateFields(List<Employee> employees) {

        int currentYear = LocalDate.now().getYear();

        class EmployeeData {
            private Employee employee;
            private String fullName;
            private int yearsWorked;

            public EmployeeData(Employee employee) {
                this.employee = employee;
                this.fullName = employee.firstName() + " " + employee.lastName();
                this.yearsWorked = currentYear - employee.hireDate();
            }

            @Override
            public String toString() {
                return "%s has worked for %d years".formatted(fullName, yearsWorked);
            }
        }

        List<EmployeeData> employeeDataList = new ArrayList<>();
        for (Employee employee : employees) {
            employeeDataList.add(new EmployeeData(employee));
        }

        employeeDataList.sort(new Comparator<EmployeeData>() {

            @Override
            public int compare(EmployeeData e1, EmployeeData e2) {
                return e1.fullName.compareTo(e2.fullName);
            }
        });

        for (EmployeeData employeeData : employeeDataList) {
            System.out.println(employeeData);
        }
    }

}
