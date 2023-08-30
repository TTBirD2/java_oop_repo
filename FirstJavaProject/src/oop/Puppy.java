package oop;

public class Puppy {
    private int Age;
    public Puppy(String name)
    {
    	System.out.println("Name chosen is" +name);
    }
    public void setAge(int age)
    {
    	this.Age = age;
    }
    public int getAge()
    {
    	return Age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Puppy puppy1 = new Puppy(" Blacky");
        puppy1.setAge(10);
        
        System.out.println("Puppy age is " +puppy1.getAge());
   }
}