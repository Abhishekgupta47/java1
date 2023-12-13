import java.util.Scanner;
class array1d{
  public static void main(String[] args) {
  
    int size,i;
    Scanner s =new Scanner(System.in);
    // int arr[]=new int[i];
    System.out.println("enter the size of the array ");
    size=s.nextInt();
    int arr[]=new int[size];
    for(i=0;i<size;i++){
      System.out.println("enter the elements in array");
      arr[i]=s.nextInt();

    }
    System.out.println("the elements in array are");
    for(i=0;i<size;i++){
      System.out.println(arr[i]);
    }

  }
}