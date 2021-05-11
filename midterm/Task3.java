import java.math.BigDecimal;
import java.text.DecimalFormat;

// import necessary package(s) 

public class Task3 {

  public static void main(String[] args) {


    Complex c1 = new Complex(1, 1);
    DecimalFormat decemal_print = new DecimalFormat("#.####");
    System.out.print("The magnitude of c1  = ");
    System.out.println(decemal_print.format(c1.magnitude()));

    System.out.print("The argument of c1  = ");
    System.out.print(decemal_print.format(c1.radian()));
    System.out.print(" = ");
    System.out.print(c1.radian()/Math.PI);
    System.out.println("pi");   

    System.out.print("The argument of the conjugate of c1  = ");
    System.out.print((0-c1.radian()/Math.PI));
    System.out.println("pi");   
  }
}
