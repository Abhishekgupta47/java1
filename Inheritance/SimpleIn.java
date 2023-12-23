class parent
{
  void show()
  {
    System.out.println("This is parent class");
  }
}
class child extends parent
{
  void disp()
  {
    System.out.println("This is child class");
  }
}

public class SimpleIn {
  public static void main(String[] args) {
    child obj = new child();
    obj.disp();
    obj.show();
  }
}
