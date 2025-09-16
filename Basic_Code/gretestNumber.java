package Basic_Code;

//3 numbers find greatest of them    int a = 200; int b = 250; int c = 150;

public class gretestNumber {
    public static void main(String[] args){
        int a=200;
        int b=250;
        int c=150;

        if(a>b){
            if(a>c){
                System.out.println(a + " is a greatest number");
            }
            else {
                System.out.println(c + " is a greatest number");
            }
        }
        else{
            if(b>c){
                System.out.println(b + " is a greatest number");
            }
            else{
                System.out.println( c + "is a greatest number");
            }
        }
    }
}
