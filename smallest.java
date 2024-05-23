import java.util.Scanner;

public class smallest {
  public static void main(String[] args) {

    int n, i;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the size of the array ");
    n = s.nextInt();
    int arr[] = new int[n];
    for (i = 0; i < n; i++) {
      System.out.println("enter the elements in the array");
      arr[i] = s.nextInt();

    }

    for (i = 0; i < n; i++) {
      if(arr[i]<arr[0]){
      arr[0] = arr[i];
      }
    }
    System.out.println("smallest="+arr[0]);

  }

}
