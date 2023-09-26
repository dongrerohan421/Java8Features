package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Stream {

    public static void main(String[] args) {
        // ---------------- Ex to filter even numbers from list using stream api -------------
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        System.out.println("Original arraylist contains these values: " + list); // OP: [10, 15, 20, 25, 30]
        List<Integer> listEvenNumber = list.stream().filter(integer -> integer % 2 ==0).collect(Collectors.toList());
        System.out.println("Filter even numbers from original arraylist using stream api: " + listEvenNumber); // OP: [10, 20, 30]
        System.out.println();

        // ------------------ Ex to add grace marks using stream map ----------
        List<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(65);
        marks.add(45);
        marks.add(80);
        marks.add(50);

        System.out.println("Original student marks: " + marks); // OP: [30, 65, 45, 80, 50]
        List<Integer> updatedMarks = marks.stream().map(integer -> integer + 5).collect(Collectors.toList());
        System.out.println("Updated marks:" + updatedMarks); // OP: [35, 50, 55, 70, 85]
        System.out.println();

        // ------------ Ex to find number of failed students marks < 35 ------
        long numberOfFailedStudents = marks.stream().filter(m -> m < 35).count();
        System.out.println("Number of failed students with marks < 35: " + numberOfFailedStudents); // OP: 1
        System.out.println();

        // ------------ Ex to sort marks using stream ---------
        System.out.println("Before sorting: " + marks); // OP: [30, 65, 45, 80, 50]
        List<Integer> sortedMarksAsc = marks.stream().sorted().collect(Collectors.toList());
        System.out.println("After sorting ascending: " + sortedMarksAsc); // OP: [30, 45, 50, 65, 80]

        List<Integer> sortedMarksDesc = marks.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("After sorting descending: " + sortedMarksDesc); // OP: [80, 65, 50, 45, 30]
        System.out.println();


        // ------------ Ex to sort string based on length using stream ---------
        System.out.println("Ex to sort string based on length using stream:");
        List<String> stringList = Arrays.asList("AAA", "AAAAA", "A", "XXX", "AAA", "AA", "AAAA");

        Comparator<String> c = (s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            return Integer.compare(l1, l2);
        };
        List<String> sortedStringList = stringList.stream().sorted(c).collect(Collectors.toList());
        System.out.println("After sorting ascending based on length: " + sortedStringList);
        System.out.println();


        // -------------- Find min nad max value using stream --------------
        System.out.println("Original arraylist contains these values: " + list); // OP: [10, 15, 20, 25, 30]
        Integer minValueFromAscList = list.stream().min(Comparator.naturalOrder()).get(); // OP: 10
        System.out.println("minValueFromAscList: " + minValueFromAscList);
        Integer maxValueFromAscList = list.stream().min(Comparator.naturalOrder()).get(); // OP: 10
        System.out.println("maxValueFromAscList: " + maxValueFromAscList);

        Integer minValueFromDescList = list.stream().min(Comparator.reverseOrder()).get(); // OP: 30
        System.out.println("minValueFromDescList: " + minValueFromDescList);
        Integer maxValueFromDescList = list.stream().min(Comparator.reverseOrder()).get(); // OP: 30
        System.out.println("maxValueFromDescList: " + maxValueFromDescList);

        Optional<Integer> maxSecondValueFromDescList = list.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
        System.out.println("maxSecondValueFromDescList: " + maxSecondValueFromDescList); // OP: Optional[25]
        Integer maxSecondValueFromDescList2 = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("maxSecondValueFromAscList: " + maxSecondValueFromDescList2); // OP: 25
        System.out.println();

        // ----------- use forEach loop using stream -------------
        System.out.println("Original arraylist contains these values: " + list); // OP: [10, 15, 20, 25, 30]
        list.stream().forEach(integer -> System.out.println("Square of " + integer + " is : " + integer * integer));
        System.out.println();


        // ----------- convert list to array using stream ------------
        System.out.println("Convert list to array using stream:");
        Integer[] intArray =  list.stream().toArray(Integer[]::new) ;
        Stream.of(intArray).forEach(System.out::println);
    }
}
