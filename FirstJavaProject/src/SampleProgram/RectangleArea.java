package SampleProgram;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r= new Scanner(System.in);
        
        System.out.println("Enter the width of the Rectangle:");
        double b= r.nextDouble();

        System.out.println("Enter the height of the Rectangle:");
         double h= r.nextDouble();

     double area=(b*h);
     System.out.println("Area of Triangle is: " + area); 
	}

}