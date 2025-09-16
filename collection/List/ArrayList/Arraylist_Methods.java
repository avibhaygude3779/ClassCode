package collection.List.ArrayList;

import java.util.*;
public class Arraylist_Methods {
       public static void main(String[] args) {

            ArrayList<String> a = new ArrayList<>();

            a.add("10");
            a.add("20");
            a.add("30");
            a.add(null);
            a.add("h");
            a.add("A");
            a.add("java");
            a.add(null);
            a.add("10");

            System.out.println("data in arrayList"+a);
            System.out.println("size of a arraylist " +a.size());

            a.add("sql");
            a.add("s");
            a.add("s");

            System.out.println("data in arraylist"+a);

            // size method is used to check the size of arraylist
            System.out.println("size of a arraylist " +a.size());

            // get method is used to get the particular data based on index
            System.out.println(a.get(6));

            //contains method is used to check weather the data is present or not in a arraylist
            System.out.println(a.contains("Java"));

            // remove method is used to remove the data in arraylist
            System.out.println(a.remove(4));
            System.out.println(a);

            //isEmpty method is used to check weather the arraylist is empty or not
            System.out.println((a.isEmpty()));



            // indexOf method gives the index of data
            // if the duplicate data is available in an arraylist then it gives the priority to the first one
            // if the data is not present it gives -1
            System.out.println(a.indexOf("10"));
            System.out.println(a.indexOf("100"));

            // clear() method is used to  clear the all data in arraylist
            a.clear();
            System.out.println(a);
            System.out.println(a.isEmpty());



        }
    }


