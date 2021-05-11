// DO NOT MODIFY THIS FILE

public class TestTask2 {

  public static void main(String[] args) {

    Complex c1 = new Complex(3, 4);
    Complex c2 = new Complex(3, 4);
    Complex c3 = new Complex(-5, -3);

    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    System.out.println("c3 = " + c3);

    System.out.println("\nIs c1 same as c2?  " + c1.equals(c2));

    System.out.println("\nThe congjugate of c3 = " + c3.conjugate());

    System.out.println("\nc1 * c3 = " + c1.multiply(c3));
  }
}
