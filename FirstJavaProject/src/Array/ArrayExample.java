package Array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] A = {-4, 6 , 1, 56 , 23, 2 };
        
        Arrays.sort(A);
        
        System.out.println(Arrays.toString(A));
        
        int index = Arrays.binarySearch(A, 1);
        if(index < 0)
        	System.out.println("Not Found");
        else
        System.out.println(A[index]+ " Found in index " +index);
        
        int [] B = Arrays.copyOf(A, 7);
        
        System.out.println("B array value =" +Arrays.toString(B));
        
        Arrays.fill(B, 100);
        	
        System.out.println("B array value =" +Arrays.toString(B));
        
        Arrays.fill(B, 1,5,55);
        System.out.println("B array value =" +Arrays.toString(B));
        
        Arrays.fill(B, 1,5,888);
        System.out.println("B array value =" +Arrays.toString(B));
        
        int[] C = Arrays.copyOf(A,6);
        
        boolean equal = Arrays.equals(A,C);
        
        if (equal)
        	System.out.println("Equal");
        else
        	System.out.println("Not Equal");
	}

}
