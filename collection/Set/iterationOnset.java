package collection.Set;
import java.util.*;
public class iterationOnset {
    public static void main(String[] args) {

        Set<String> s = new HashSet<>();
        System.out.println("Add element in hashset");
        s.add("White");
        s.add("Brown");//duplicate
        s.add("Red");

        System.out.println("Element in set: "+s);

        //iterate element using iterator
        Iterator itr = s.iterator();
        while (itr.hasNext()){
            String next = (String) itr.next();
            System.out.println("Element retrived one by one :"+next);
        }

    }
}
