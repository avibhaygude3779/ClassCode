package JAVA_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String[] args) {

        //Empty stream
        System.out.println("Empty stream");
        Stream<Integer> emptyStream = Stream.empty();
        System.out.println(emptyStream.count()); // 0 because stream is empty

        //stream with single value
        System.out.println("single value stream");
        Stream<Integer> singleValue = Stream.of(1);
        System.out.println(singleValue.count());

        //stream with multiple value
        System.out.println("Multiple value stream");
        Stream<Integer> multipleValue = Stream.of(1,2,3,4);
        System.out.println(multipleValue.count());

        //stream using collection
        System.out.println("collection stream");
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        list.stream().forEach((x)-> System.out.println(x));
    }
}
