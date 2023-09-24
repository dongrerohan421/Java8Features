package org.example.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Java8Function {
    // Whenever you want to perform any operation  and return an output we should use Function FI
    // Function FI has apply() abstract method

    public static void main(String[] args) {

        // ------------------- Example to square the number -------------------
        Function<Integer, Integer> squareIt = x -> x * x;
        System.out.println("Square of 4: " + squareIt.apply(4));
        System.out.println("Square of 20: " + squareIt.apply(20));
        System.out.println();

        // ------------------- Example to return length of string -------------------
        Function<String, Integer> strLen = x -> x.length();
        System.out.println("Length of \"Hello World\" is: " + strLen.apply("Hello World"));
        System.out.println("Length of \"World\" is: " + strLen.apply("World"));
        System.out.println();

        // ------------------- Example to convert string to upper case -------------------
        Function<String, String> strUpper = x -> x.toUpperCase();
        System.out.println("Upper case of \"Hello World\" is: " + strUpper.apply("Hello World"));
        System.out.println("Upper case of \"world\" is: " + strUpper.apply("World"));
        System.out.println();


        // ------------------- Find grade of the student -------------------
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("James", 50));
        studentList.add(new Student("Max", 55));
        studentList.add(new Student("Jimmy", 70));
        studentList.add(new Student("Rob", 80));
        studentList.add(new Student("Andrew", 33));
        studentList.add(new Student("Bob", 39));

         Function<Student, String> studentGrade = student -> {
             String grade = "";
             if (student.getMarks() >= 80) grade = "A [Distinction]";
             else if (student.getMarks() >= 60) grade = "B [First Class]";
             else if (student.getMarks() >= 50) grade = "C [Second Class]";
             else if (student.getMarks() >= 35) grade = "D [Third Class]";
             else grade = "F [Failed]";
             return grade;
         };

        for (Student s: studentList) {
            System.out.println("Student name: " + s.getName() + ", marks: " + s.getMarks() + ", grade is: " +studentGrade.apply(s));
        }
        System.out.println();

        // ------------------- Find students with marks >= 60 -------------------
        Predicate<Student> studentPredicate = x -> x.getMarks() >= 60;
        for (Student s: studentList) {
            if (studentPredicate.test(s)) {
                System.out.println("Student name: " + s.getName() + ", marks: " + s.getMarks() + ", grade is: " +studentGrade.apply(s));
            }
        }
        System.out.println();

        // ------------------- Function chaining -------------------
        Function<Integer, Integer> f1 = i -> 2 * i;
        Function<Integer, Integer> f2 = i -> i * i * i;
        System.out.println("Function andThen of integer 2: " + f1.andThen(f2).apply(2));
        System.out.println("Function andThen of integer 2: " + f1.andThen(f2).andThen(f1).apply(10));
        System.out.println("Function compose of integer 2: " + f1.compose(f2).apply(2));
        System.out.println("Function compose of integer 2: " + f1.compose(f2).compose(f2).apply(2));


        // ------------- stringToIntFunction --------------------------
        System.out.println("\nConvert string value to int:");
        String[] strings = {"1", "2"};
        ToIntFunction<String> stringToIntFunction = s -> Integer.parseInt(s) * 2;
        for (String s : strings) {
            System.out.println("String: \""+ s + " * 2\" ToInt: " + stringToIntFunction.applyAsInt(s));
        }
    }
}
