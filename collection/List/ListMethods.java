package collection.List;
import java.util.*;
public class ListMethods {
    public static void main(String[] args) {
        List <String> l = new ArrayList<>() ;
        List <String> l2 = new ArrayList<>();

        //method used boolean add(Object o)
        l.add("hello");
        l.add("Welcome");
        l.add("to");
        l.add("java");
        l.add(null);
        l.add("hello");
        System.out.println(l);

        //method used void add(int index,object o)
        l.add(2,null);
        l.add(7,"end");
        System.out.println(l);

        //method used boolean addAll(collection c)
        l2.add("1");
        l2.add("2");
        l.addAll(l2);

        //method used boolean addAll(int index,collection c)
        l.addAll(2,l2);

        // object remove(int index)
        l.remove(2);
        l.remove(3);

        //object set(int index,object o)
        l.set(2,null);

        //object get(int index)
        System.out.println("Object at index 2 is: "+l.get(2));

        //int indexOf(object o)
        System.out.println("Index of object to is: "+l.indexOf("to"));

        //int lastIndexOf(Object o)
        System.out.println("Last index of element 2 is: "+l.lastIndexOf("2"));


        System.out.println(l);
    }
}
