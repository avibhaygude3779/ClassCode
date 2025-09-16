package JAVA_8.LambdaExpression;
//6. Find average of doubles using lambda
//Write a Java program to implement a lambda expression to find the average of a list of doubles.
import java.util.Arrays;
import java.util.List;

interface listavg{
    double avgOfList();
}
public class findavgOflist {
    public static void main(String[] args) {


        List<Double> list = Arrays.asList(11.11, 22.32, 45.23, 10.12, 23.11, 41.11);
        listavg avg = () -> {
            double sum = 0;
            for (double n : list) {
                    sum += n;
            }
            return (double) sum / list.size();
        };
        System.out.println(avg.avgOfList());
    }
}
