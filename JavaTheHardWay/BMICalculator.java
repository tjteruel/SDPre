import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, inches, pounds, feet, inches2;

    System.out.print( "Your height (feet only)");
    feet = keyboard.nextDouble();

    System.out.print( "Your height (inches): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    inches2 = (feet*12)+inches;
    m = inches2*.0254;
    kg = pounds*0.454;
    bmi = kg / (m*m);
    System.out.println( "Your BMI is " + bmi );
  }
}
