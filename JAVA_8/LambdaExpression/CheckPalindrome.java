package JAVA_8.LambdaExpression;
//14. Check if string is palindrome using lambda
//Write a Java program to implement a lambda expression to check if a given string is a palindrome.
interface palindrome{
    Boolean isPalindrome(String s);
}
public class CheckPalindrome {
    public static void main(String[] args) {
        palindrome check = (s)->{
            int i=0 , j=s.length()-1;
            while(j>i){
                if(s.charAt(i)!=s.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        };
        String str = "kanak";
        boolean isPalindrome = check.isPalindrome(str);
        if(isPalindrome){
            System.out.println("The string is palindrome");
        }else{
            System.out.println("The string is not palindrome");
        }
    }
}
