import java.util.Scanner;
 class Rectangle{
    double length,breadth;
    void getdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the lenght");
        length=sc.nextDouble();
         System.out.println("enter the depth");
        breadth=sc.nextDouble();
        
    }
    void area(){
        double a;
        a=length*breadth;
        System.out.println("the area is = "+a);
    }
 }
public class Demo {
    public static void main(String[] args) {

        Rectangle obj =new Rectangle();
        obj.getdata();
        obj.area();
    
}
    
}