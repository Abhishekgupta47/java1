class A{
  int i,j;
}
class B extends A{
  int k;
}
class C extends B{
   int p;
   void showijkp(){
    System.out.println("i="+i+"\tj="+j+"\tk="+k+"\tp="+p);
   }
  }


void multi()
{
  System.out.println("i*j*k*p="+(i*j*k*p));
}


public class MultiLevelInheritence {
  public static void main(String[] args) {
     C obj =new C();
     obj.i=10;
     obj.j=5;
     obj.k=15;
     obj.p=10;
  }
  
}

