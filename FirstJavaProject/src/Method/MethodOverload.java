package Method;

public class MethodOverload {
	 public static void Sum() {
     	int a = 20;
     	int b = 30;
     	System.out.println("Sum is " +(a+b));
        }
        public static int Sum(int a) {
     	int b = a+12;
     	return b;
        }
	    public static void Sum(int a, int b) {
	    	System.out.println("Sum is " +(a+b));
	    }
	    public static void Sum(float a, float b) {
	    	System.out.println("Sum is " +(a+b));
	    }
	    public static float Sum(int a, int b , float c) {
	    	float d = (a+b+c);
	    	return d;
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			Sum();
			System.out.println("Sum :" +Sum(4));
			Sum(20,4);
			Sum(2.5f,2.5f);
			System.out.println("Sum is "+Sum(3,4,5.5f));
		}
}
