import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String words, password, magic;

    password = magic;

        System.out.println("WELCOME TO THE BANK OF JAVA.");
        System.out.print("ENTER PASSWORD:");
        words = keyboard.next();

        while ( !words.equals("password") ) {
          System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
          System.out.println("ENTER PASSWORD:");
          words = keyboard.next();
        }

        pin = 12345;
        
        System.out.print("\nPASSWORD ACCEPTED, ENTER YOUR PIN: ");
        entry = keyboard.nextInt();

        while ( entry != pin ) {
        System.out.println("\nINCORRECT PIN. TRY AGAIN.");
        System.out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
        }

        System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
    }
}
