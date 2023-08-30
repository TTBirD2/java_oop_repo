package SampleProgram;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        final double pie = 3.14;
        
        System.out.println("Enter radius : ");
        
        int radius = sc.nextInt();
        
        double area = pie * radius * radius;
        
        System.out.println("Area of Circle = " +area);
	}

}