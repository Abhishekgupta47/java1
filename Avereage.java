import java.util.Scanner;
public class Avereage {
  public static void main(String[] args) {
    
  
   int sum=0,size;
   int avg;
Scanner s =new Scanner(System.in);
   System.out.println("enter the size of the array");
   size=s.nextInt();
   int a[]= new int[size];
   System.out.println("enter the elements in the array");
   for (int i=0;i<size;i++){
        a[i]=s.nextInt();
        sum=sum+a[i];
   }
  
   avg= (sum/a.length);
   System.out.println("sum is "+sum +"average is "+avg);
}
}