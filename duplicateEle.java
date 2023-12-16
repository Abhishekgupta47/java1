import java.util.Scanner;

public class duplicateEle {

    public static void main(String[] args) {

        int i, j, flag = 0, size;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = s.nextInt();
        int arr[] = new int[size];
        for (i = 0; i < size; i++) {
            System.out.println("Enter the element");
            arr[i] = s.nextInt();
        }
        System.out.println("Duplicate elements in the array are:");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (i != j && arr[i] == arr[j]) {
                    flag = 1;
                    System.out.println(arr[i]);
                }
            }
        }
        if (flag == 0) {
            System.out.println("No duplicates");
        }
    }
}
