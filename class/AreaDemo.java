class Area{
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
    Area obj=new Area();
    obj.area(5.5,1.1);
    obj.area(2.5);
  }
  
}
