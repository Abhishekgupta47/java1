import java.util.Scanner;
public class peak {

  public static void main(String[] args) {
    int size ,i;
    Scanner s = new Scanner(System.in);
   System.out.println("enter the array size");
   size=s.nextInt();
   int arr[]=new int[size];
   for(i=0;i<size;i++){
    System.out.println("enter the elementd in array");
    arr[i]=s.nextInt();
   }
  }
  
}
