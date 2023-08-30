package Method;

import java.util.Scanner;

public class Methodexe3 {
    static int ft;
    static float inches;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        float ft1 = InputData();
        float ft2 = InputData();
        float resultfeet = add(ft1,ft2);
        display (resultfeet);
	}
        public static float InputData()
        {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter Feet: ");
        	ft = sc.nextInt();
        	System.out.println("Enter Inches: ");
        	inches = sc.nextInt();
        	if (inches >=12)
        	{
        		ft++;
        		inches -= 12;
        	}
        	float feet =convertFeet();
        	return feet;
        }
        public static float convertFeet()
        {
        	return ft + (inches/12);
        }
        public static float add(float ft1, float ft2)
        {
        	return ft1 + ft2;
        }
        public static void display(float resultfeet)
        {
        	System.out.println("Result = " +resultfeet+ "ft");
        }
        
}
