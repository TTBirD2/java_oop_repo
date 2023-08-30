package SampleProgram;

import java.util.Scanner;

public class Dowhile {

  public static void main(String[] args) {
    char con1;
    // TODO Auto-generated method stub
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Num1");
      int num1 = sc.nextInt();
      System.out.println("Enter Num2");
      int num2 = sc.nextInt();
      System.out.println("Enter + or - or x or /");
      String con = sc.next();
      int result = 0;
      switch (con) {
      case "+" : result = num1 + num2;break;
      case "-" : result = num1 - num2;break;
      case "*" : result = num1 * num2;break;
      case "/" : result = num1 / num2;break;
      default: System.out.println("Wrong input");
      }
      System.out.println("Result "+ result);
      System.out.println("Do you wanna do it again? Y or N");
       con1 = sc.next().charAt(0);
    }while (con1 == 'Y');
  }

}