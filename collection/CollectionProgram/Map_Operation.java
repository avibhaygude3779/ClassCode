package collection.CollectionProgram;

import java.util.HashMap;

public class Map_Operation {
    public static void main(String[] args) {
        //1. Associate Key with Value in HashMap
        HashMap<Integer,String > hsmp = new HashMap<>();
        hsmp.put(1,"Mahesh");
        hsmp.put(3,"soma");
        hsmp.put(4,"yogesh");
        hsmp.put(5,"tejas");
        hsmp.put(2,"avdut");
        hsmp.put(8,"shubham");
        hsmp.put(6,"vaibhav");
        hsmp.put(7,"anil");

        System.out.println(hsmp);

        //2. Count Key-Value Mappings in Map
        System.out.println("Kay Value pair in Hashmap: "+hsmp.size());

        //3. Copy Mappings to Another Map
        System.out.println("Copy one hashmap to another: ");
        HashMap<Integer,String> hsmp2 = new HashMap<>(hsmp);
        System.out.println(hsmp2);

        //4. Remove All Mappings from Map
        hsmp2.clear();
        System.out.println("After removing all entries: "+ hsmp2);

        //5. Check If Map is Empty
        System.out.println("Map is empty : "+ hsmp2.isEmpty());

        //7. Check If Key Exists in Map
        System.out.println("Is 4 exit in map: "+hsmp.containsKey(4));

        //8. Check If Value Exists in Map
        System.out.println("Is value exist in map: "+hsmp.containsValue("Mahesh"));

        //9. Get Set View of Map Entries
        System.out.println("Set of keys: "+hsmp.keySet());

    }
}
