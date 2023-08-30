package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TemperatureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;  
		int totalsum=0, above=0, below=0;
		double AverageTemp;
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter the Days ");  
		
		day=sc.nextInt();  
		
		int[] temp = new int[10];    
		for(int i=0; i<day; i++)  
		{  
	    System.out.println("Enter the Temperature");
		temp[i]=sc.nextInt(); 
		totalsum+=temp[i];
		} 
		AverageTemp=totalsum/day;
		System.out.println("Average Temp: " +AverageTemp);
        for (int b=0; b<day; b++)
        {
        	if (temp[b]>AverageTemp)
        		above++;
        	else if (temp[b]<AverageTemp)
        		below++;
        }
        System.out.println(above+"days were above average temperature");
        System.out.println(below+"days were below average temperature");
        Arrays.sort(temp);
        System.out.println("Sorted Array: "+Arrays.toString(temp));
        System.out.println("Two Coldest day"+temp[0]+","+temp[1]);
        System.out.println("Two Hotest day"+temp[temp.length-2]+","+temp[temp.length-1]);
        int temp2[]=Arrays.copyOf(temp,temp.length);
        boolean equal = Arrays.equals(temp2,temp);
        if(equal)
        {
          System.out.println("Equal");
        }
        else
          System.out.println("Not equal");
        Arrays.fill(temp2,34);
        System.out.println("Temp2 array value: "+Arrays.toString(temp2));
	}

}
