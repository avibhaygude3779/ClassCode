package collection.List;
import java.util.*;
public class demplist {
    public static void main(String[] args) {
        List<String> a= new ArrayList<>();
        a.add("10");
        a.add("20");
        a.add("30");
        a.add(null);
        a.add("h");
        a.add("A");
        a.add("java");
        a.add(null);
        a.add("10");

        System.out.println(a);
        System.out.println( a.get(3));
        System.out.println(a.remove("h"));
    }
}
