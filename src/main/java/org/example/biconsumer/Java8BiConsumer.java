package org.example.biconsumer;


import org.example.predicate.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class Java8BiConsumer {
    public static void main(String[] args) {
        // ----------- Salary increment example ----------------
        System.out.println("Salary increment example: ");
        List<Employee> employees = new ArrayList<>();
        populate(employees);
        BiConsumer<Employee, Integer> biConsumer = Employee::seteSalary;

        for (Employee e : employees) {
            int increment = e.geteSalary() + 500;
            biConsumer.accept(e, increment);
        }

        for (Employee e : employees) {
            System.out.println("EName: " + e.geteName() + " salary increment: " + e.geteSalary());
        }
    }

    private static void populate(List<Employee> employees) {
        employees.add(new Employee("James", 1000));
        employees.add(new Employee("Justin", 2000));
        employees.add(new Employee("Jimmy", 3000));
        employees.add(new Employee("Jack", 4000));
    }
}
