package collection.Cursors;
import java.util.*;
public class Listiterator {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        for (int i=0;i<=10;i++){
            l.add(i);
        }
        System.out.println(l);

        ListIterator<Integer> litr = l.listIterator();

        while (litr.hasNext()){
            Integer i=litr.next();
            if(i%2==0){
                //System.out.println(i);
                litr.add(12);
            }else {
                litr.set(11);
            }
        }
        System.out.println(l);
    }
}
