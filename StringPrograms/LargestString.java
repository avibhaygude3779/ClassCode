package StringPrograms;

public class LargestString {
    public static void main(String[] args) {
         String[] fruits={"mango","apple","Bannana"};
          String largest = fruits[0];

          for(int i=0;i<fruits.length;i++){
              if(largest.compareToIgnoreCase(fruits[i])<0){
                  largest=fruits[i];
              }
          }
        System.out.println("largest String is : "+largest);
    }
}
