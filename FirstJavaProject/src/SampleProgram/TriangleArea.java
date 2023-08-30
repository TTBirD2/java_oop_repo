package SampleProgram;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the width of the Triangle:");
        double b= s.nextDouble();

        System.out.println("Enter the height of the Triangle:");
         double h= s.nextDouble();

     double area=(b*h)/2;
     System.out.println("Area of Triangle is: " + area); 
	}

}
