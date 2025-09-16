package JAVA_8.Functional_Interface;
//supplier return a result get nothing
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Integer> s = ()->1;
        System.out.println(s.get());

        //predicate,supplier,function,consumer
        Predicate<Integer> predicate = (x)->x%2==0;
        Function<Integer,Integer> fun = (x)-> x*x*x;
        Consumer<Integer> con =(x)-> System.out.println(x);
        Supplier<Integer> su = ()->100;

        if(predicate.test(su.get())){
            con.accept(fun.apply(su.get()));
        }
    }
}
