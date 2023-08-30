package Interfaceoop;

public class Triangle {
    double a;
    double b;
    double c;
    
    public Triangle(double a, double b, double c) {
    	this.a = a;
    	this.b = b;
    	this.c = c;
    }
    public double area() {
    	double s = (a+b+c)/2.0;
    	return Math.sqrt(s*(s-a)*(s-b)*(s-c));		
    }
    public double parameter() {
    	return a+b+c;
    }
}
