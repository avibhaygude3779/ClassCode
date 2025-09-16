package collection.Map;
import java.util.*;
public class treemap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(1,"hello");
        hm.put(5,"cpp");
        hm.put(3,"python");
        hm.put(4,"java");
        hm.put(2,"hii");

       // hm.put(null,null);

        System.out.println(hm);

        TreeMap tm = new TreeMap(hm);
        System.out.println(tm);

    }
}
