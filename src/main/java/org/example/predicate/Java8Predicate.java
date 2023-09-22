package org.example.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate {
    // Wherever some conditional checks are required to implement then we should use Predicate FI
    // Predicate FI returns Boolean value
    // Predicate FI has test() abstract method.

    public static void main(String[] args) {

        //To find number is even
        IntPredicate evenPredicate = x -> x % 2 == 0;
        System.out.println("Is number even: " + evenPredicate.test(10));
        System.out.println("Is number even: " + evenPredicate.test(15));

        //To find string length is greater than 6 or not
        Predicate<String> strLength = s -> s.length() > 6;
        System.out.println("Is strLength greater than 6: " + strLength.test("Hello World"));
        System.out.println("Is strLength greater than 6: " + strLength.test("World"));

        // Predicate takes Employee object as input
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("James", 2000));
        employeeList.add(new Employee("Lexi", 3000));
        employeeList.add(new Employee("Bob", 4000));
        employeeList.add(new Employee("Max", 5000));
        employeeList.add(new Employee("Rose", 6000));
        employeeList.add(new Employee("Jesus", 2005));

        // To find employee with salary > 4000
        System.out.println("To find employee with salary > 4000:");
        Predicate<Employee> employeePredicate = employee -> employee.geteSalary() > 4000;
        for (Employee employee: employeeList) {
            if (employeePredicate.test(employee)){
                System.out.println(employee.geteName() + " : " + employee.geteSalary());
            }
        }

        // To find employee with salary > 3000 & salary < 5000
        System.out.println("To find employee with salary > 3000 & salary < 5000:");
        Predicate<Employee> employeePredicate2 = employee -> employee.geteSalary() > 3000 && employee.geteSalary() < 5000;
        for (Employee employee: employeeList) {
            if (employeePredicate2.test(employee)){
                System.out.println(employee.geteName() + " : " + employee.geteSalary());
            }
        }

        // To find employee with length of name > 3 & salary >= 3000
        System.out.println("To find employee with length of name > 3 & salary > 3000:");
        Predicate<Employee> employeePredicate3 = employee -> employee.geteName().length() > 3 && employee.geteSalary() >= 3000;
        for (Employee employee: employeeList) {
            if (employeePredicate3.test(employee)){
                System.out.println(employee.geteName() + " : " + employee.geteSalary());
            }
        }

        //Predicate.and()
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noGreaterThan8 = x -> x > 8;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collectAnd = list.stream()
                .filter(noGreaterThan5.and(noGreaterThan8))
                .collect(Collectors.toList());

        System.out.println("Predicate.and() to find noGreaterThan5.and(noGreaterThan8): " + collectAnd);

        //Predicate.or()
        List<Integer> collectOr = list.stream()
                .filter(noGreaterThan5.or(noGreaterThan8))
                .collect(Collectors.toList());

        System.out.println("Predicate.or() to find noGreaterThan5.and(noGreaterThan8): " + collectOr);


        //Predicate.negate()
        Predicate<String> startWithA = x -> x.startsWith("A");
        List<String> stringList = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");

        List<String> collectNegate = stringList.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println("Predicate.negate() for startWithA: " + collectNegate);
    }
}
