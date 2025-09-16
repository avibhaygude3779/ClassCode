package collection.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class AddingEntries {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        System.out.println("Adding elements in map");

        m1.put(1,"Avinash");
        m1.put(2,"Mahesh");
        m1.put(3,"Vishwa");
        m1.put(4,null);
        m1.put(5,"shubham");
        m1.put(null,null);

        System.out.println(m1);
        System.out.println("Size of a map is: "+m1.size());

        m1.remove(4);
        m1.remove(null);
        System.out.println("After removing element  a map is: "+m1);
        System.out.println("After removing element Size of a map is: "+m1.size());
        System.out.println("Key set of map m1: "+m1.keySet());
        //creating new map
        Map<Integer,String > m2 = new HashMap<>();
        m2.put(5,"cc");
        m2.put(6,"bb");
        m2.put(7,"aa");

        //adding m2 to m1
        m1.putAll(m2);
        System.out.println(m1);
        //replacing value

        m2.replace(5,"dd");
        System.out.println(m2);

        //getting value of specific element
        System.out.println(m2.get(5));
        System.out.println(m2.entrySet());
        m2.putIfAbsent(5,"dd");

        //iterating value in map
        Iterator<Map.Entry<Integer,String>> itr =m1.entrySet().iterator();
        while (itr.hasNext()){
            Object i = itr.next();
            System.out.println(i);
        }

        //iterating using forEach method
        m1.forEach((k,v)-> System.out.println(("Keys: "+k+" Value: "+v)));

    }
}
