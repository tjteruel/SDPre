public class Objective2Lab5 {
  public static void main(String[] args){
    double side1, side2, side3;
    double a, b, c;

    side1 = 10;
    side2 = 8;

    a = side1*side1;
    b = side2*side2;
    c = a+b;

    side3 = Math.sqrt(c);
    System.out.println("The hypotenus of a triangle with sides 10 and 8 is " + side3);
  }
}
