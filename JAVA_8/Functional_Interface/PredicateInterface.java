package JAVA_8.Functional_Interface;

import java.util.function.Predicate;
//predicate is a boolean value function ,To check something we use predicate , used to check condition
public class PredicateInterface {
    public static void main(String[] args) {
        Predicate<String>  FirstWordIaA= (s1)-> s1.charAt(0)=='A';
        Predicate<String>  EndWordIsh= (s1)-> s1.charAt(s1.length()-1)=='h';

        //default  and method
        Predicate<String> and=FirstWordIaA.and(EndWordIsh);
        System.out.println(and.test("Avinash"));

        //default  or method
        Predicate<String> or=FirstWordIaA.or(EndWordIsh);
        System.out.println(or.test("avinash"));

        //negate default method
        System.out.println(FirstWordIaA.negate().test("Avinash"));

        //static isEqual method
        Predicate<String> predicateEqual =Predicate.isEqual("Avinash");
        System.out.println(predicateEqual.test("avinash"));


    }
}
