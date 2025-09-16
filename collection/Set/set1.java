package collection.Set;
import java.util.*;
public class set1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> s = new HashSet<>();
        System.out.println("Initial size of set: "+ s.size());
        System.out.println("Adding element to set");

        s.add("Mango");
        s.add("Black");
        s.add("red");
        s.add("Brown");

        System.out.println("size of set after adding some element: "+ s.size());
        s.add("red"); // duplicate element size remain same
        s.add("Brown");
        System.out.println("Element in a set: "+s);
        System.out.println("size of set after adding duplicate element: "+ s.size());

        //removing element in set
        s.remove("Black");
        System.out.println("After removing element: "+s);

        if(s.equals("Black"))
        {
            System.out.println("Black element is not present in set.");
        }
        else
        {
            s.add("Black");
            System.out.println("Black is added successfully.");
            System.out.println("Set elements after adding black element");
            System.out.println(s);
        }
// Create another set object to add collection of elements to the above set.
        Set<String> s2 = new LinkedHashSet<String>();
        s2.add("White");
        s2.add("Brown");//duplicate
        s2.add("Red"); // Duplicate element.

// Call addAll() method to add all the elements of the given collection.
        s.addAll(s2);
        System.out.println("Set elements after adding elements from given collection");
        System.out.println(s);


    }
}
