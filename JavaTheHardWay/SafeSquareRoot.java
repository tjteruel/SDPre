import java.util.Scanner;

public class SafeSquareRoot {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;

        System.out.print("Give me a number, and I'll find it's square root. ");
        x = keyboard.nextDouble();

        if ( x < 0 ) {

          y = Math.sqrt( Math.abs(x));
          System.out.println("The square root of "+x+" is "+y+"i");
          x = keyboard.nextDouble();
        }
        else{
        y = Math.sqrt(x);

        System.out.println("The square root of "+x+" is "+y);
    }
}
}
