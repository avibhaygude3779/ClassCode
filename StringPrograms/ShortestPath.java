package StringPrograms;

public class ShortestPath {
    public static float Shortestpath(String path){
         int x=0,y=0;
         for(int i=0;i<path.length();i++){
         char ch=path.charAt(i);
         if(ch=='N'){
             y++;
         }
         else if(ch=='S'){
             y--;
         }
         else if (ch=='E'){
             x++;
         }
         else{
             x--;
         }
         }
         int x2=x*x;
         int y2=y*y;
         return (float)Math.sqrt(x2+y2);
    }

    public static void main(String[] args) {
        String path="WNENEE";
        System.out.println(Shortestpath(path));

    }
}
