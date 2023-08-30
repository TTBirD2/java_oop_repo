package Method;

import java.util.Scanner;

public class Methodrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght");
        int l = sc.nextInt();
        System.out.println("Enter the width");
        int w = sc.nextInt();
        
        System.out.println("Area = " +area(l,w));
        
        System.out.println("Perimeter = " +Perimeter(l,w));
	}
        public static int area(int length,int width) {
        	return (length*width);
        }
        public static int Perimeter(int length,int width) {
        	return (2*(length+width));
        }
}
