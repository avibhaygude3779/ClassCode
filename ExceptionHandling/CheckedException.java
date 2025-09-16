package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        try{
        FileInputStream file=new FileInputStream("jtgnhjynhjy");
        }
               catch (FileNotFoundException e){
        System.out.println(e);
        }    }
}



//FileInputStream file=new FileInputStream("jtgnhjynhjy");        this will throw the filenotfoundexception
