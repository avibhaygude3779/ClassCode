package Classcode;
import java.util.Scanner;
public class FindDuplicateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String lowercaseInput = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            lowercaseInput += ch;
        }

        String[] words = new String[100];
        String word = "";
        int index = 0;

        for (int i = 0; i < lowercaseInput.length(); i++) {
            if (lowercaseInput.charAt(i) != ' ') {
                word +=lowercaseInput.charAt(i) ;
            } else {
                if (!word.equals("")) {
                    words[index++] = word;
                    word = "";
                }
            }
        }

        if (!word.equals("")) {
            words[index++] = word;
        }


        boolean[] visited = new boolean[index];
        for (int i = 0; i < index; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < index; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println("Duplicate words are: "+words[i]);
                }
            }
        }
    }
}
