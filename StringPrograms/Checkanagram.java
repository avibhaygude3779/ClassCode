package StringPrograms;

public class Checkanagram {
    public static void main(String[] args) {
        String str1 = "lentst";
        String str2 ="silent";
        System.out.println(isAnagram(str1,str2));

    }
    static boolean isAnagram(String str1,String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if (str1.length() != str2.length()) {
            return false;
        }
        char temp;
        for (int i = 0; i < ch1.length; i++) {
            for (int j = i + 1; j < ch1.length; j++) {
                if (ch1[i] > ch1[j]) {
                    temp = ch1[i];
                    ch1[i] = ch1[j];
                    ch1[j] = temp;
                }
                if (ch2[i] > ch2[j]) {
                    temp = ch2[i];
                    ch2[i] = ch2[j];
                    ch2[j] = temp;
                }
            }
        }
        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;

    }
}

