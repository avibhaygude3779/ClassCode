package JAVA_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    public static void main(String[] args) {
          //1.collect
                /*collect() takes a Collector as an argument.
                A Collector defines three things:
                Supplier → creates a new result container (e.g., a new ArrayList).
                Accumulator → adds an element to the container.
                Combiner → merges two containers (used in parallel streams).
                That’s why collect(Collectors.toList()) knows how to:
                create an ArrayList
                add elements into it
                merge partial lists if run in parallel*/
        List<Integer> list = Arrays.asList(1,2,3,3,4,1);
        List<Integer> even  =  list.stream()
                .filter((x)->x%2==0)
                .collect(Collectors.toList());
        System.out.println(even);

        //2.foreach
        //3.reduce
        System.out.println(list.stream().reduce((x,y)->x+y));/*Why does it print with Optional?
                                The reduce(BinaryOperator<T> accumulator) method in Streams returns an Optional<T>.
                                That’s because:
                                If the stream is empty, there is no value to return.
                                Instead of returning null (which may cause NullPointerException), Java wraps the result in an Optional.*/
        //4.count
        //5.anyMatch , AllMatch , noneMatch
        System.out.println(list.stream()
                           .peek(System.out::println)
                           .anyMatch((x)->x%2==0)
        );

        System.out.println(list.stream()
                .peek(System.out::println)
                .allMatch((x)->x%2==0)
        );

        System.out.println(list.stream()
                .peek(System.out::println)
                .noneMatch((x)->x%2==0)
        );

        //findFirst,findAny
        System.out.println(list.stream()
                .findFirst()
        );

        System.out.println(list.stream()
                .findAny()
        );
    }

}
