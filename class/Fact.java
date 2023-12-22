import java.util.Scanner;
public class Fact {
    void  factorial(int x){
        int f=1;
        while(x!=0){
            f=f*x;
            x--;
        }
        System.out.println("Factorial is = "+f);

    
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        a=sc.nextInt();
        Fact f =new Fact();
        f.factorial(a);
       
     } 
    }

