public class AlphebetizeStringFunctions {

  //Global Variables
  public static String alphabet = "  The  quick  brown fox jumps  over the  lazy dog.";

  public static void main (String[] args)
  {
    System.out.println("\nOrigonal Sentence is: " + alphabet);
    //Modify variable to delete extra spaces.
    String remainingPhrase = alphabet.toLowerCase();
    remainingPhrase = remainingPhrase.trim();
    //Find and verify the period of the sentence
    int periodPositionI = remainingPhrase.indexOf(".");
    System.out.println("Origonal Length of sentence: " + periodPositionI);
    String periodPositionS = remainingPhrase.substring(periodPositionI, periodPositionI+1);
    Boolean periodPositionB = periodPositionS.equals(".");
    System.out.println("Is it really a period: " + periodPositionB);
    remainingPhrase = remainingPhrase.substring(0, periodPositionI);
    System.out.println("Remaining Phrase is: " + remainingPhrase + " ... with length: " + remainingPhrase.length() );
    //Create Substrings for all words
    int word1space = remainingPhrase.indexOf(" ");
    System.out.println("\nSpace at: " + word1space);
    String word1 = remainingPhrase.substring(0, word1space);
    System.out.println("Word is: " + word1 + " ... with length: " + word1.length());
    Boolean word1True;
    if ( word1space == word1.length() ) {
      word1True = true;
    } else {
      word1True = false;
    }
    System.out.println("Does the word length and the sentence position match: " + word1True);
    remainingPhrase = remainingPhrase.substring(word1space, periodPositionI);
    //
    remainingPhrase = remainingPhrase.trim();
    System.out.println("\nRemaining Phrase is: " + remainingPhrase + " ... with length: " + remainingPhrase.length() );
    periodPositionI = remainingPhrase.length();
    int word2space = remainingPhrase.indexOf(" ");
    String word2 = remainingPhrase.substring(0, word2space);
    System.out.println("Word is: " + word2 + " ... with length: " + word2.length());
    Boolean word2True;
    if ( word2space == word2.length() ) {
      word2True = true;
    } else {
      word2True = false;
    }
    System.out.println("Does the word length and the sentence position match: " + word2True);
    //remainingPhrase = remainingPhrase.substring(word2space, periodPositionI);
    //
    remainingPhrase = remainingPhrase.substring(word2space, periodPositionI);
    periodPositionI = remainingPhrase.length();
    remainingPhrase = remainingPhrase.trim();
    System.out.println("\nRemaining Phrase is: " + remainingPhrase);
    //
    //Second Word
    /*
    System.out.println("\nSecond Word\n");
    remainSentence = remainSentence.trim();
    int word2space = remainSentence.indexOf(" ");
    System.out.println(word2space);
    String word2 = remainSentence.substring(0, word2space);
    System.out.println(word2);
    //Third Word
    periodPositionI = periodPositionI - word2space;
    remainSentence = remainSentence.substring(word2space, periodPositionI);
    remainSentence = remainSentence.trim();
    int word3space = remainSentence.indexOf(" ");
    String word3 = remainSentence.substring(0, word3space);
    //
    System.out.println("The third word is " + word3);
    // Fourth Word
    periodPositionI = periodPositionI - word3space;
    System.out.println(periodPositionI);
    remainSentence = remainSentence.substring(word3space, periodPositionI);
    remainSentence = remainSentence.trim();
    int word4space = remainSentence.indexOf(" ");
    String word4 = remainSentence.substring(0, word4space);
    //
    System.out.println("The fourth word is " + word4);
    //What happens if 2 spaces is the default for editting the separation between words
    //Which functions and which variables need to be repeated to capture the rest of the words
    */
  }
}
