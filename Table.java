import java.util.*;
public class Table {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int i,n;
      System.out.println("Enter the number ");
      n=sc.nextInt();
      for(i=1;i<=10;i++){
         int s=n*i;
         System.out.println(s);
      }
    } 
}
