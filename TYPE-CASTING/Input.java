import java.util.Scanner;
public class Input {
  public static void main(String[] args) {
    
    int age;
    String name;
    Scanner s =new Scanner(System.in);
    System.out.println("enter your name ");
    name  = s.nextLine();
   System.out.println("enter your age ");
   age=s.nextInt();
   System.out.println("wellcome "+ name +"  age  "+ age);

  }
  
}
