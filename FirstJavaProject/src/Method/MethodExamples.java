package Method;

import java.util.Scanner;

public class MethodExamples {
  int a, b;

  public MethodExamples(int a, int b) {
    this.a = a;
    this.b = b;// Object ka pine sine thaw this
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    MethodExamples m1 = new MethodExamples(10, 20);
    System.out.println("Before swapping");
    System.out.println("m1.a = " + m1.a + " " + "m2.a = " + m1.b);
    swap(m1);
    System.out.println("After swapping");
    System.out.println("m1.a = " + m1.a + " " + "m2.a = " + m1.b);
  }

  public static void swap(MethodExamples m2) {
    int temp = m2.a;
    m2.a = m2.b;
    m2.b = temp;
  }
}
