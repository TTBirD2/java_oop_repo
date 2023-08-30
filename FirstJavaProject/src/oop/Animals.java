package oop;

public class Animals {
    String color = "white";
    Animals(){
    	System.out.println("animal is created");
    }
    public void display() {
    	System.out.println("Display method of animal class");
    }
}
    class Dog extends Animals{
    	String color="black";
    	Dog(){
    		super();
    		System.out.println("Dog is created");
    	}
	void printcolor() {
		System.out.println(color);
		System.out.println(super.color);
		display();
		super.display();
	}
    class TestSuper{
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
            Dog d = new Dog();
            d.printcolor();
    	}
    }
}
