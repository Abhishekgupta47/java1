interface employee{
   void work();
}
interface salary{
  void salary();
}
class Emp implements employee,salary{
    public void work()
   {
    System.out.println("employee work as webdeveloper");
   }
   public void salary()
   {
    System.out.println("the salory of the employee ==100000");
   }

}
class Rahul implements employee,salary{
  public void work()
  {
    System.out.println("rahul work as developer");
  }
  public void salary()
  {
    System.out.println("rahul salary is =100000");
  }
}
public class multi2 {
  public static void main(String[] args) {
    Emp emp=new Emp();
    Rahul r=new Rahul();
    emp.work();
    emp.salary();
    r.work();
    r.salary();
  }
  
}
