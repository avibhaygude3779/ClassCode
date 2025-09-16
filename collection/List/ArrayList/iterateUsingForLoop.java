package collection.List.ArrayList;
import java.util.*;
public class iterateUsingForLoop {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
