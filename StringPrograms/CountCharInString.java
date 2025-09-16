package StringPrograms;
import java.util.*;
public class CountCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();

        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for(int i=0;i<str.length();i++){
            if(visited[i]){
                continue;
            }
            if(str.charAt(i)!=' ') {
                count++;
                visited[i] =true;
            }else {
                continue;
            }
        }
        System.out.println("count of char in string: "+count);
    }
}
