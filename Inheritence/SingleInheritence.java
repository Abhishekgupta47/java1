class A {
  int i, j;

  void showij() {
    System.out.println("i= " + i + "j=" + j);
  }
}

class B extends A {
  int k;

  void showk() {
    System.out.println("k=" + k);
  }



  void sum() {
    System.out.println("i+j+k" + (i + j + k));
  }
}


public class SingleInheritence {
  public static void main(String[] args) {
     B obj =new B();
     obj.i=10;
     obj.j=15;
     obj.k=5;
     obj.showij();
     obj.showk();
     obj.sum();

  }

  
}
