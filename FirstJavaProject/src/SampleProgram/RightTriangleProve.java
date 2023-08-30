package SampleProgram;

import java.util.Scanner;

public class RightTriangleProve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        double side1, side2, hypo;  
        System.out.print("Enter a value for Hypo : ");
        hypo = input.nextDouble();
        System.out.print("Enter a value for Side 1: ");
        side1 = input.nextDouble();     
        System.out.print("Enter a value for Side 2: ");
        side2 = input.nextDouble();      
        double sum1 =(side1*side1)+(side2*side2);
        double sum2 = hypo*hypo;
        if(sum1 == sum2)
        {
        	System.out.println("This is Right Triangle");
        }
        else
        {
        	System.out.println("This is not Right Triangle");
        }
	}

}