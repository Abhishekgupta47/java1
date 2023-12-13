import java.util.Scanner;

public class largest 
{
  public static void main(String[] args) {
    int i, large,size;

    Scanner s =new Scanner(System.in);
    System.out.println("enter the size of the array");
    size=s.nextInt();
    int arr[]=new int[size];
    for(i=0;i<size;i++)
    {
      System.out.println("enter elements");

      arr[i]=s.nextInt();
    
      large=arr[0];

      if(arr[i]>large){
        large=arr[i];
      
        System.out.println("the largest element= "+large);
    }

  }
}
}


