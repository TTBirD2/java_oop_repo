package oop;

public class Inheritance {
    protected String brand = "Ford";
    public void honk() {
    	System.out.println("Stuuuu, tuuuuu!");
    }
}
    class Car extends Inheritance{
    	private String modelName = "Mustang";
		public static void main(String[]args) {
    		Car myCar = new Car();
    		myCar.honk();
    		System.out.println(myCar.brand+" "+ myCar.modelName);
    	}
	}
