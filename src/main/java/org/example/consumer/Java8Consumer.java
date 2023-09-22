package org.example.consumer;

import org.example.function.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8Consumer {
    //Consumer is a functional interface; it takes an argument and returns nothing.

    public static void main(String[] args) {

        // ------------ Student Grade Example --------------
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

        Predicate<Student> studentPredicate = x -> x.getMarks() >= 60;

        Consumer<Student> studentConsumer = student -> System.out.println("Student name: " + student.getName() + ", marks: " + student.getMarks() + ", grade is: " +studentGrade.apply(student));

        // ----------- To print all student details with their grade ------------
        System.out.println("Print all student details with their grade:");
        for (Student s: studentList){
            studentConsumer.accept(s);
        }

        // ----------- To print all student details with marks >= 60 ------------
        System.out.println();
        System.out.println("To print all student details with marks >= 60:");
        for (Student s: studentList){
            if (studentPredicate.test(s)) studentConsumer.accept(s);
        }



        // ------------ Consumer chaining example ---------------------
        System.out.println("Consumer chaining example: ");
        Consumer<Movie> movieConsumer1 = movie -> System.out.println(movie.getmName() + " is ready to release");
        Consumer<Movie> movieConsumer2 = movie -> System.out.println(movie.getmName() + " released but it is bigger flop");
        Consumer<Movie> movieConsumer3 = movie -> System.out.println(movie.getmName() + " storing information in database");
        Consumer<Movie> movieConsumerChain = movieConsumer1.andThen(movieConsumer2).andThen(movieConsumer3);

        Movie movie = new Movie("Spider");
        movieConsumerChain.accept(movie);
    }
}
