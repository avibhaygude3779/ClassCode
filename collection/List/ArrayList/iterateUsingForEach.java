package collection.List.ArrayList;
import java.util.*;
public class iterateUsingForEach {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        for( int i:al){
            System.out.println(i);
        }

    }
}
