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
    //Find the end of the sentence, limited to periods
    int periodPositionI = lowerCaseMemAlphabet.indexOf(".");
    System.out.println(periodPositionI);
    String periodPositionS = lowerCaseMemAlphabet.substring(periodPositionI, periodPositionI+1);
    Boolean periodPositionB = periodPositionS.equals(".");
    System.out.println(periodPositionB);
    String noPeriodlowerCaseMemAlphabet = lowerCaseMemAlphabet.substring(0, periodPositionI);
    System.out.println(noPeriodlowerCaseMemAlphabet);
    //Create Substrings for all words
    int word1space = noPeriodlowerCaseMemAlphabet.substring(" ");
    System.out.println(word1space);
  }
}
