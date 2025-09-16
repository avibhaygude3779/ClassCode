package JAVA_8.LambdaExpression;
//1. Sum two integers using lambda expression
//Write a Java program to implement a lambda expression to find the sum of two integers.


interface operation{
    int add(int x,int y);
}

public class SumOfTwoInteger {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        operation op = (x,y)->x+y; // used lambda to add two integers
        int sum = op.add(a,b);
        System.out.println(sum);
}
}


//  addition of integers equivalent predefined functional interface is BiFunctional(Integer,Integer,Integer)
//public class SumOfTwoInteger {
//    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//       BiFunction<Integer,Integer,Integer> op = (x, y) -> x + y; // used lambda to add two integer
//        System.out.println(op.apply(a,b));
//    }
//}
