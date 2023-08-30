package Method;

import java.util.Scanner;

public class Starmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the number of columns");
        int col = sc.nextInt();
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        
        display(ch,col,row);
	}
        public static void display(char ch, int col, int row) {
        	for(int a=1; a<=row; a++) {
        		for(int b=1; b<=col; b++) {
        			System.out.print(ch+ " ");
        		}
        		System.out.println();
        	}
        }
}
