import java.util.Scanner;
public class ArmStrong {
  public static void main(String[] args) {
    int n,r,sum=0;
    int t;
    
    System.out.println("enter the number");
    Scanner s=new Scanner(System.in);
     n=s.nextInt();
     t=n;
     while(n>0){
      r=n%10;
      sum=sum+(r*r*r);
      n=n/10;

     }
     if(sum==t){
      System.out.println("Armstrong");
     }
     else{
      System.out.println("not armstrong");
     }

  }
}
