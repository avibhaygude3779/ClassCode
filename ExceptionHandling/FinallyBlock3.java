package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyBlock3 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis=null;
        try {
            fis =new FileInputStream("dfgg");
        }
        catch (FileNotFoundException e) {
            System.out.println(" File not found . ");
        }
        finally {
            if(fis!=null){
                fis.close();
            }
        }

    }
}
