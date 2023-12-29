import java.util.Scanner;
public class palindrome {
   public static void main(String[] args) {
     int n;
     int t,rem,rev=0;
     Scanner s =new Scanner(System.in);
     System.out.println("enter the number");
     n=s.nextInt();
     t=n;
     while(n>0)               // 1  2  1
     {
       rem=n%10;              // 1  
       rev=rev*10+rem;             //
       n=n/10;
       
     }
     if(rev==t)
     {
      System.out.println("palindrome");
     }
     else{
      System.out.println("not palindrome");
     }
   }
}
