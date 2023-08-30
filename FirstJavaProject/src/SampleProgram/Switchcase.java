package SampleProgram;

import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
	    System.out.println("Enter Second Number");
	    int b = sc.nextInt();
	    int c = 0;
        System.out.println("Enter Operator");
        String con = sc.next();
        switch(con) {
        case "+":c=a+b;
        	System.out.println(c);
        	break;
        case "-":c=a-b;
        	System.out.println(c);
        	break;
        case "*":c=a*b;
        	System.out.println(c);
        	break;
        case "/":c=a/b;
        	System.out.println(c);
        	break;
        default:
        	System.out.println("Invalid Input");
        }
	}

}
