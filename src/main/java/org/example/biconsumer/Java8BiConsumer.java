package org.example.biconsumer;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Java8BiConsumer {
    public static void main(String[] args) {
        // ----------- Salary increment example ----------------
        System.out.println("Salary increment example: ");
        List<Employee> employees = new ArrayList<>();
        populate(employees);
        BiConsumer<Employee, Double> salIncrement =  (employee, increment) -> employee.salary += increment;

        for (Employee e: employees) {
            salIncrement.accept(e, 500.0);
        }

        for (Employee e: employees){
            System.out.println("EName: " + e.name+ " salary increment: " + e.salary);
        }
    }

    private static void populate(List<Employee> employees) {
        employees.add(new Employee("James", 1000));
        employees.add(new Employee("Justin", 2000));
        employees.add(new Employee("Jimmy", 3000));
        employees.add(new Employee("Jack", 4000));
    }
}
