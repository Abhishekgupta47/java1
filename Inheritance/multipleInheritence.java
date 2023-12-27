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
  }
