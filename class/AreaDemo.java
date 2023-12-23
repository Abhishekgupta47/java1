import java.util.Scanner;
class Area{
  Scanner sc =new Scanner(System.in);

  void input()
  {
    double r;
    System.out.println("Enter the radius of circle ");
    r=sc.nextDouble();
  }
  void input(double h,double b){
    System.out.println("you entered the values of h and b ="+b+h);
  }
  void area(double h,double b){
    double  area= (0.5*b*h);
    System.out.println("The area of traiangle is "+area);
  }
  void area(double r){
    double area1 =(3.14*r*r);
    System.out.println("the area of circle is "+area1);
  }
  
}
public class AreaDemo {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    double h,b,r;
    System.out.println("enter height and bidth");
    System.out.println("enter the radius");
    h=sc.nextDouble();
    b=sc.nextDouble();
    r=sc.nextDouble();
        Area obj=new Area();
    obj.input();
    obj.input(h,b);    
    obj.area(r);
    obj.area(h,b);
  
  }
  
}
