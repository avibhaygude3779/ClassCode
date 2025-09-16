package JAVA_8.optional_Class;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {


        String[] words = new String[10];
        //String word = words[4].toUpperCase();
        //System.out.println(word); // Gives a NullPointerException
        Optional<String> checkNull = Optional.ofNullable(words[5]);
        if(checkNull.isPresent()){
            String word = words[4].toUpperCase();
            System.out.println(word);
        }
        else {
            System.out.println("The word is null");
        }
    }
}
