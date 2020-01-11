public class ThereAndBackAgain {
  public static void main( String[] args ) {
    System.out.println( "Here." );
    erebor();
    System.out.println( "Back first time." );
    //erebor();
    System.out.println( "Back second time." );
  }

  public static void erebor() {
    System.out.println( "There." );
  }
}
//with line 6 as comments, the second "There" is not printed.
