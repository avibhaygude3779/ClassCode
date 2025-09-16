package collection.Cursors;
import java.util.*;
public class enumeration {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        for(int i=0;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v);
        Enumeration<Integer> e = v.elements();
        while(e.hasMoreElements()){
            Integer I = (Integer)e.nextElement(); // type casting object to integer
            if(I%2==0){
                System.out.println(I);
            }
        }
        System.out.println(v);
    }
}
