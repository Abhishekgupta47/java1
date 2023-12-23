// import java.util.Scanner;
class OverloadingDemo{
  void show(){
    System.out.println("Abhishek");
  }
  void show(int a){
    System.out.println("a="+a);
  }
  void show(int a, int b){
    System.out.println("a="+a+"b="+b);
  }
}
public class Overloading{
  public static void main(String[] args) {
    OverloadingDemo obj =new OverloadingDemo();
    obj.show();
    obj.show(5);
    obj.show(3,4);
    
  }
}