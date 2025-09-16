package StringPrograms;
import java.util.*;
public class CountDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        boolean[] visited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    visited[j] = true;
                    count++;
                }
            }

            if(count>1){
            System.out.println(str.charAt(i) + " is appear " + count + " times");
           }
        }


    }
}
