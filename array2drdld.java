import java.util.Scanner;

public class array2drdld {
  public static void main(String[] args) {

    int row, column, i, j;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the row :");
    row = s.nextInt();
    System.out.println("Enter the column :");
    column = s.nextInt();
    int arr[][] = new int[row][column];

    for (i = 0; i < row; i++) {
      for (j = 0; j < column; j++) {
        System.out.println("Enter the elements");
        arr[i][j] = s.nextInt();
      }

    }
    System.out.println("The matrix array is \n");
    for(i=0;i<row;i++)
    {
      for(j=0;j<column;j++)
      {
        System.out.println(arr[i][j]+ " ");
      }
      System.out.println();
    }

    // code for performing sum of left and right diagonal

    int ld=0,rd=0;
    j=2;
    for(i=0;i<row;i++)
    {
      ld=ld+arr[i][i];
      rd=rd+arr[j][i];
      j--;
    }
    System.out.println("\nsum of left diagonal is ="+ld);
    System.out.println("\nsum of right diagonal is ="+rd);

  }

}
