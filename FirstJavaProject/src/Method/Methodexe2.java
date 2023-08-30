package Method;

import java.util.Scanner;

public class Methodexe2 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		do{
	      System.out.println("Enter first number");
	      int num1 = sc.nextInt();
	      System.out.println("Enter second number");
	      int num2 = sc.nextInt();
	      System.out.println("Enter + or - or x or /");
	      char oper = sc.next().charAt(0);
	      int result = 0;
	      
	      switch(oper)
	      {
	      case '+' : result = sum(num1,num2);break;
	      case '-' : result =sub(num1,num2);break;
	      case '*' : result =multi(num1,num2);break;
	      case '/' : result =div(num1,num2);break;
	      default : System.out.println("Wrong Input");
	      }
	      System.out.println("Result = " +result);
	      }while (repeat ());}
	      public static boolean repeat()
	      {
	    	  System.out.println("Do another yes/no?");
	    	  String status = sc.next();
	    	  if (status.equalsIgnoreCase("yes"))
	    		  return true;
	    	  else return false;
	      }
	      public static int sum(int n1, int n2)
	      {
	    	  return (n1 + n2);
	      }
	      public static int sub(int n1, int n2)
	      {
	    	  return (n1 - n2);
	      }
	      public static int multi(int n1, int n2)
	      {
	    	  return (n1 * n2);
	      }
	      public static int div(int n1, int n2)
	      {
	    	  return (n1 / n2);
	      }
	}


