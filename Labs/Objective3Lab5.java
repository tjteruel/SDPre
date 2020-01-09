import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args){
    int a, b, c;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number:");
    a = input.nextInt();

    System.out.println("Please enter another number:");
    b = input.nextInt();

    c = a+b;

    System.out.println("The sum of " + a + " and " + b + " is " +c);

    input.close();
  }
}
