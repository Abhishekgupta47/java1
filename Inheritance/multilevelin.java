class Number{
  int num;
  void getval(int n)
  {
    num=n;
  }
    void showval(){
      System.out.println("num="+num);
    }
  }
  class Square extends Number{
    int sq;
    void calcsquare()
    {
      sq=num*num;
    }
    void showsquare(){
      System.out.println("square="+sq);
    }
  }
class sumofSquare extends Square{
  int sum =0;
  void calcsum(){
    int r;
    while (sq>0) {
      r=sq%10;
      sum=sum+r;
      sq=sq/10;
    }
  }
  void showsumofsquare(){
System.out.println("sum of square "+sum);
  }
}
class multilevelin {
  public static void main(String[] args) {
    sumofSquare obj =new sumofSquare();
    obj.getval(5);
    obj.showval();
    obj.calcsquare();
    obj.showsquare();
    obj.calcsum();
    obj.showsumofsquare();
  }
}