import java.util.Scanner;
public class rekurencja{
   public static void main(String[] args){
     Scanner s=new Scanner(System.in);   
     int z = s.nextInt();
     System.out.println(funkcja(z));
   }
   public static int funkcja(int n){
     if (n > 1){
          return n * funkcja(n-1);
          
     }

     else{
          return 1;
     }
   }
}