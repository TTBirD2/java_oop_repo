package SearchingSorting;

import java.util.Scanner;

public class MainClass {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d;
		do {
		Scanner sc = new Scanner(System.in);
        ElectronicSystem ele = new ElectronicSystem();
        ele.WelcomePage();
        System.out.println("Do you wanna try again? Type Yes or No.");
        d = sc.next();
        }while(d.equalsIgnoreCase("Yes"));
	}

}
