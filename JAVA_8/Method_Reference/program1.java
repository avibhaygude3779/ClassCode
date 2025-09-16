package JAVA_8.Method_Reference;

import java.util.Arrays;
import java.util.List;

public class program1 {
    public void print(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        program1 test = new program1();
        List<String> student = Arrays.asList("avi","mahesh","vishwa");
        student.forEach(test::print);  // used method reference
    }
}
