class Student {
  public static int count = 0;

  // Constructor
  public Student() {
      count++;
  }
  
}

public class lab2 {
  public static void main(String[] args) {
      int table;
      Student student1 = new Student();
      Student student2 = new Student();
      System.out.println("Number of Student objects: " + Student.count);// for counting the object count
      System.out.println("table of count"); 
      for(int i=1;i<=10;i++){
        table=Student.count*i;
        System.out.println(Student.count+"*"+i+"="+table);
        
      }
  }
}
