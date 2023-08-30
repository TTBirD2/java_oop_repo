package oop;

public class Animal {
    public String name;
    public int height;
    private String gender;
    
    public String getGender(String something)
    {
    	this.gender = something;
    	return gender;
    }
    
	public void getAnimal()
	{
		name = "Aung Net";
		height = 4;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal dog = new Animal();
        System.out.println(dog.name); // null (as no value is assigned yet)
        dog.getAnimal();              // assign value by invoking method
        System.out.println(dog.name); // Aung Net
        System.out.println(dog.height); // 4
        System.out.println(dog.gender); // null (as no value is assigned)
        dog.getGender("male");          // assign value "male"
        System.out.println(dog.gender); // male
        // invoke type method return value
	}

}
