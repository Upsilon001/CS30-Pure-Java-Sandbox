public class AlphebetizeStringFunctions {

  //Global Variables
  public static String alphabet = "  The quick brown fox jumps over the lazy dog.";

  public static void main (String[] args)
  {
    System.out.println(alphabet);
    //Modify variable to delete extra spaces.
    String memAlphabet = alphabet.trim();
    System.out.println(memAlphabet);
    //Modify for lowercase
    String lowerCaseMemAlphabet = memAlphabet.toLowerCase();
    System.out.println(lowerCaseMemAlphabet);
  }
}
