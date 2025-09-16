package JAVA_8.Functional_Interface;
// function is a functional interface used to perform some operation it has take an input and generate a result
import java.util.function.Function;

public class functionChaning {
    public static void main(String[] args) {
        Function<Integer,Integer> fun1 = (x) -> 2*x ;
        Function<Integer,Integer> fun2 = (x) -> x*x*x;

        // anThen is default method used to add two operation 1st operation done first and then above first operation result second operation is done
        Function<Integer,Integer> andThenMethod=fun1.andThen(fun2);
        System.out.println(andThenMethod.apply(3));//216

        Function<Integer,Integer> andThenMethod2=fun2.andThen(fun1);
        System.out.println(andThenMethod2.apply(3));//54

         // compose method reverse of andThen
        Function<Integer,Integer> composeMethod=fun1.compose(fun2);
        System.out.println(composeMethod.apply(3));//54

        //static identity method it gives input as output
        Function<String,String > identityFunction=Function.identity();
        System.out.println(identityFunction.apply("Avinash"));
    }
}
