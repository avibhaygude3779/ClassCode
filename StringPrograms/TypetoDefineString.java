package StringPrograms;

public class TypetoDefineString {
    public static void main(String[] args) {

        // Stored in scp
        String str = "Hello";
        System.out.println(str);

        //Create a new object and stored in heap
        String str2 = new String("TDIT_Solutions");
        System.out.println(str2);

        //array stored on heap and the ascii value of char is stored in integer cache
        char[] ch = {'m','a','h','e','s','h'};
        String str3 = new String(ch);

        System.out.println(ch);

    }
}
