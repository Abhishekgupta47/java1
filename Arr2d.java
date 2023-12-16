import java.util.*;

public class Arr2d {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int row, column, i, j;

    System.out.println("enter the no of row : ");
    row = s.nextInt();
    System.out.println("Enter the number of column :");
    column = s.nextInt();
    int arr1[][] = new int[row][column];
    int arr[][] = new int[row][column];
    // code for taking input
    for (i = 0; i < row; i++) {
      for (j = 0; j < column; j++) {
        System.out.println("enter the elements");
        arr[i][j] = s.nextInt();
      }
    }
    // code for performing transpose
    for (i = 0; i < row; i++) {
      for (j = 0; j < column; j++) {
        arr1[i][j] = arr[j][i];
      }
    }
    // code for print original matrix
    System.out.println("The matrix elements are ");
    for (i = 0; i < row; i++) {
      for (j = 0; j < column; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
    // code for displaying transpose matrix
    System.out.println("transpose matrix");
    for (i = 0; i < row; i++) {
      for (j = 0; j < column; j++) {
        System.out.print(arr1[i][j]+" ");
      }
      System.out.println();
    }
  }

}
