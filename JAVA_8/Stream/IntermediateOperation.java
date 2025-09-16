package JAVA_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
    public static void main(String[] args) {

        //1.filter
        List<Integer> list = Arrays.asList(1,2,3,3,4,1);
        List<Integer> even  =  list.stream()
                             .filter((x)->x%2==0)
                             .collect(Collectors.toList());
        System.out.println(even);

        //2 . map
        List<String> list2 = Arrays.asList("Avinash","mahesh","Anil","Vishwa");
        list2.stream()
                .map(String::length)
                .forEach(System.out::println);

        //3.sorted
        System.out.println("Sorting using simple sorted: ");
        list2.stream()
                .sorted()
                .forEach(System.out::println);
        //4.sorted(comparator)
        System.out.println("Sorting using comparator sorted: ");
        list2.stream()
                .sorted((a,b)->b.length()-a.length())
                .forEach(System.out::println);
        //5. distinct
        System.out.println("Printing distinct key word: ");
        System.out.println(list.stream()
                .distinct()
                .collect(Collectors.toList())
        );

        //6. limit() method
        System.out.println(Stream.iterate(1,(x)->x+1)
                .limit(100)
                .count()
        );

        //7. Skip() method
        System.out.println(Stream.iterate(1,(x)->x+1) // here we create an infinite stream
                .skip(20)  // skip first 20 elements
                .limit(100) // only 100 elements is collected
                .collect(Collectors.toList()) // print 21 to 120 elements because we skip first 20 elements and limit is 100
        );


    }
}
