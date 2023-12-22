class Box{
  double width;
  double height;
  double depth;
}

public class volume {
   public static void main(String[] args) {
    Box t =new Box();
    t.width=10.5;
    t.height=5.7;
    t.depth=12.5;
    double v;
    v=t.width*t.height*t.depth;
     System.out.println("the volume is "+v);

   }
}
