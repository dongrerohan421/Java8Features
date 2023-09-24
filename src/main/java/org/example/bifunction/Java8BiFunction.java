package org.example.bifunction;

import org.example.predicate.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/*
    In Java 8, BiFunction is a functional interface; it takes two arguments and returns an object.
 */
public class Java8BiFunction {

    public static void main(String[] args) {
        // ---------- Ex to print Employee object -------------------
        System.out.println("Ex to print Employee object using BiFunction FI:");
        List<Employee> employeeList = new ArrayList<>();
        BiFunction<Integer, String, Employee> biFunction = (eNo, eName) -> new Employee(eNo, eName);

        employeeList.add(biFunction.apply(100, "James"));
        employeeList.add(biFunction.apply(200, "Rob"));
        employeeList.add(biFunction.apply(300, "Abby"));
        employeeList.add(biFunction.apply(400, "Max"));
        employeeList.add(biFunction.apply(500, "Scott"));

        for (Employee e: employeeList) {
            System.out.println("ENo: " + e.geteNo() + " EName: " + e.geteName());
        }
    }
}
