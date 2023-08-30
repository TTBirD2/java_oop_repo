package oop;

import java.util.Scanner;   
public class Studentexe{
	String name;
	int age;
    public Studentexe()
    {
    	 Scanner sc = new Scanner(System.in);
         System.out.println("Enter Student name");
         name = sc.nextLine();
         System.out.println("Enter age");
         age = sc.nextInt();	
    }
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
       
        Studentexe stu = new Studentexe();
        System.out.println(stu.name + " " + stu.age);
	}

}
