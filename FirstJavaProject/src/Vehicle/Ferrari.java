package Vehicle;

public class Ferrari extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ferrari far = new Ferrari();
        far.ViewgetName();
	}
    public void ViewgetName() {
    	super.getName("Aung Aung", 18);
    }
}
