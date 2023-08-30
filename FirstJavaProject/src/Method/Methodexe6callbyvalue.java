package Method;

import java.util.Scanner;

public class Methodexe6callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
        System.out.println("Enter Second Number");
        int b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("A = " +a+ " B = " +b);
        
        swap(a,b);
        System.out.println("After swapping");
        System.out.println("A = " +a+ " B = " +b);
	}
        public static void swap(int c,int d) {
        	int temp = c;
        	  c=d;
        	  d=temp;
        	  System.out.println("After Swapping");
        	  System.out.println("C = " +c+ " D = " +d);
        }
        
}
