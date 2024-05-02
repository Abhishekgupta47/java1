class Student {
  public static int count = 0;

  // Constructor
  public Student() {
      count++;
  }
  // public static int getCount() {
  //     return count;
  // }
}

public class lab2 {
  public static void main(String[] args) {
      
      Student student1 = new Student();
      Student student2 = new Student();
      System.out.println("Number of Student objects: " + Student.count); // Output: 3
  }
}
