package Array;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns");
		int col = sc.nextInt();
		
		int [][] A = new int [row][col];
		
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				System.out.println("Enter a value");
				A[i][j] = sc.nextInt();
			}
		}
		System.out.println("Display Data Array");
		for (int i = 0; i < A.length; i++)
		{
			for (int j = 0; j < A[i].length; j++)
			
				System.out.print(A[i][j]+" ");
			
				System.out.println();			
		}
		
	}
}
