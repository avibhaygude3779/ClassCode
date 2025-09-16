package StringPrograms;
import java.util.*;
public class countNumOfWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();
        int count = 0;
        boolean inWord=false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If character is not a space, tab, or newline, we're inside a word
            if (ch != ' ' && ch != '\t' && ch != '\n') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        System.out.println("Number of word present in string is: "+count);
    }
}
