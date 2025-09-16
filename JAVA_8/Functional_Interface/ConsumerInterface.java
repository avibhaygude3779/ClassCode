package JAVA_8.Functional_Interface;
//consumer is a functional interface which just represents an operation that accepts a single input argument and returns no result.
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<String> consumer1 = (s)-> System.out.println(s);
        consumer1.accept("Avinash");
        Consumer<List<Integer>> conList1 = (li)->{
            for(int i:li){
                System.out.println(i);
            }
        };

        Consumer<List<Integer>> conList2 = (li)->{
            for(int i:li){
                System.out.println(i+100);
            }
        };
        //andThen method
        Consumer<List<Integer>> result = conList2.andThen(conList1);
        result.accept(Arrays.asList(1,2,3,4));
    }
}
