package Interfaceoop;

public class Circle implements Shape{
	
	public double radius;
	public Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	public double parameter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
	
}