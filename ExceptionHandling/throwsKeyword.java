package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsKeyword {

        void readFile () throws FileNotFoundException
        {
            FileInputStream fis = new FileInputStream("abcd");
        }
        void saveFile () throws FileNotFoundException
        {
            String text = " this is demo";
            FileInputStream fos = new FileInputStream(" fhg");
        }
    }

class test {
    public static void main(String[] args) {
        throwsKeyword th=new throwsKeyword();
        try {
            th.readFile();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        try {
            th.saveFile();
        }
        catch (FileNotFoundException ae ){
            ae.printStackTrace();
        }
    }
}