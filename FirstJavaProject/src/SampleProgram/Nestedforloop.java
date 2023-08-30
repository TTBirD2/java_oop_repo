package SampleProgram;

public class Nestedforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 10; i++)
        {
        	for (int j= 1; j <= i; j++)
        	{
        	System.out.print("*");
        	}
        	System.out.println();
        }
		
		System.out.println("==================================================================");
		
		for (int a = 0; a < 10; a++)
        {
        	for (int b=10; b>a; b--)
        	{
        	System.out.print("*");
        	}
        	System.out.println();
        }
	}

}