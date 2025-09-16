package collection.CollectionProgram;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayList_Operation {
    public static void main(String[] args) {


        //1. Create and Print ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(50);
        al.add(30);
        al.add(20);
        System.out.println("Printing array list"+al);

        //2. Iterate ArrayList Elements
        //using iterator
        System.out.println("iterating using iterator: ");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            int num = (int) itr.next();
            System.out.println(num);
        }

        //using forEach
        System.out.println("Iterating using for each");
        for (int num:al){
            System.out.println(num);
        }

        //3. Insert at First Position
        al.add(0,35);
        System.out.println("inserted at first position: "+ al);

        //4. Retrieve Element by Index
        System.out.println("retriving element by index: "+al.get(0));

        //5. Update ArrayList Element
        System.out.println("Updating element: ");
        al.set(0,25);
        al.set(2,45);
        System.out.println("After update Arraylist: "+ al);

        //6. Remove Third Element
        al.remove(3);
        System.out.println("After removing third element arraylist: "+al);

        //7. Search Element in ArrayList
        System.out.println("25 is available in list: "+al.contains(25));
        System.out.println("25 is present in which index position: "+al.indexOf(25));

        //8. Sort ArrayList
        Collections.sort(al);
        System.out.println("After Sorting : "+al);

        //9. Copy ArrayList
        System.out.println("Copy arraylist: "+al.clone());

        //11. Reverse ArrayList
        Collections.reverse(al);
        System.out.println("After performing reverse operation : "+ al);

        //12. Extract Sublist from ArrayList
        System.out.println("sublist of arraylist: "+al.subList(0,2));

        //13. Compare Two ArrayLists
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(33);
        al2.add(2);
        al2.add(11);

        System.out.println("Is two arraylist are equal: "+al.containsAll(al2));

        //14. Swap ArrayList Elements
        Collections.swap(al,2,3);
        System.out.println(al);

        //15. Join Two ArrayLists
        al.addAll(al2);
        System.out.println("after joining two list"+al);

        //17. Clear ArrayList
        al2.clear();
        System.out.println("After clearing arraylist: "+al2);

        //18. Check if ArrayList is Empty
        System.out.println("is Arraylist empty: "+al2.isEmpty());

        //19. Trim ArrayList Capacity
        al.trimToSize();
        System.out.println("Trim operation is succesful : ");

        //20. Increase ArrayList Capacity
        al.ensureCapacity(20);
        System.out.println("Capacity increased successfully: ");


    }

}
