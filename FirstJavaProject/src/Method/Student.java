package Method;

public class Student {
    String name;
    int age;
    static String module="Unit1 Programming";
    
    public void createstudent() {
    	System.out.println("Create student object = " +name+ " " +age);
    }
    
    public static void display() {
    	System.out.println(module);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student st1 = new Student();
          st1.name="Su Su";
          st1.age= 17;
          st1.createstudent();
          
        Student st2 = new Student();
          st2.name="Bo Bo";
          st2.age= 20;
          st2.createstudent();
          
          System.out.println(Student.module);
          Student.display();
	}

}
