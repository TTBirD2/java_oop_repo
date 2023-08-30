package oop;

public class Calculation {
    int z;
    public void addition(int x, int y) {
    	z=x + y;
    	System.out.println("The sum of the given numbers:" +z);
    }
    public void subtraction(int x, int y) {
    	z = x - y;
    	System.out.println("The difference between two number: " +z);
    }
}
    class My_Calculation extends Calculation{
    public void multi(int x, int y) {
    	z = x * y;
    	System.out.println("The difference between two number: " +z);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 20, b=10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a,b);
        demo.subtraction(a,b);
        demo.multi(a,b);
	}
   }

