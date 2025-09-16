package collection.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmapIteration {
    public static void main(String[] args) {
        HashMap hmap = new HashMap();
        hmap.put('V', "Violet");
        hmap.put('I', "Indigo");

        // it will return the old value
        System.out.println( hmap.put('V', "Blue"));
        hmap.put('G', "Green");
        hmap.put('Y', "Yellow");
        hmap.put('O', "Orange");
        hmap.put('R', "Red");
        System.out.println(hmap);
        System.out.println("Size of hashmap "+hmap.size());

        //iteration over entries
        Iterator itr=hmap.entrySet().iterator();
        while (itr.hasNext()){
            Object data = itr.next();

            System.out.println(data);

        }

        //iterating over keys
        Iterator itr2= hmap.keySet().iterator();
        System.out.println("Iterating over keys");
        while (itr2.hasNext()){
            Object data = itr2.next();
            System.out.println(data);
        }

        //iterating over values
        Iterator itr3= hmap.values().iterator();
        System.out.println("Iterating over values");
        while (itr3.hasNext()){
            Object data = itr3.next();
            System.out.println(data);
        }

    }
}
