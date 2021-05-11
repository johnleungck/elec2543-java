public class Complex{
  public int real_part;
  public int imaginary_part;

  public Complex(int real, int imaginary){
    real_part = real;
    imaginary_part = imaginary;
  }

  public String toString(){
    if (imaginary_part < 0){
      int impart = imaginary_part * -1;
      return real_part + "-" + impart + "i";
    }
    return real_part + "+" + imaginary_part + "i";
  }

  public boolean equals(Complex c){
    if (real_part==c.real_part && imaginary_part==c.imaginary_part){
      return true;
    }
    return false;
  }

  public Complex conjugate(){
    int impart = imaginary_part * -1;
    Complex con_complex = new Complex(real_part, impart);
    return con_complex;
  }

  public Complex multiply(Complex c){
    int multi_real = real_part*c.real_part - imaginary_part*c.imaginary_part;
    int multi_imag = real_part*c.imaginary_part + imaginary_part*c.real_part;
    Complex multi_complex = new Complex(multi_real, multi_imag);
    return multi_complex;
  }

  public double magnitude(){
    double r = Math.pow((Math.pow(real_part, 2) + Math.pow(imaginary_part, 2)), 0.5);
    return r;
  }

  public double radian(){
    double rad = Math.atan2(real_part, imaginary_part);
    return rad;
  }
}