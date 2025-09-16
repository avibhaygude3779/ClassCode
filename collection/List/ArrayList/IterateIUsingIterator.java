package collection.List.ArrayList;
import java.util.*;
public class IterateIUsingIterator {
    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);

        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()){
            Integer i = (Integer) itr.next();
            System.out.println(i);
        }
    }
}
