package oop;

public class Student {
    public Student()
    {
    	System.out.println("Syudent Constructor");
    	
    }
    public Student(String name)
    {
    	System.out.println("Student name is " +name);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student st = new Student();
        Student stu  = new Student("Lady Wai");
        Student st1 = new Student("Laung Laung");
	}

}
