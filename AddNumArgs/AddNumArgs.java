import java.io.*;

public class AddNumArgs {

  //Global Variables for ARGS
  static long[] numLong = new long[2];
  static int[] numInt = new int[2];
  static double[] numDouble = new double[2];
  static float[] numFloat = new float[2];
  static String[] input = new String[2];

  public int addNum (int numA, int numB) {
    return numA + numB;
  }

  public double divideNum (double numA, double numB) {
    return numA / numB;
  }

  public static void main(String args[])
  throws ArrayIndexOutOfBoundsException
  { //removed IOException so program would work
    try{ //ARGS[] required arguments
      int i=0;
      while (args[i] == "") {}
          //
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println ("\nYou must enter arguments, two numbers, to start the program.\n" +
                          "Please restart the program with arguments. Thank-you\n");
      System.exit(0);
    }
    try{ //Program will only accept two arguements
      int i=2;
      while (args[i] == "" ) {}
      System.out.println("\nYou have entered a third number." +
                         "Please enter only two numbers as arguments. Thank-you.\n");
      System.exit(0);
    }
    catch (ArrayIndexOutOfBoundsException e) {//empty catch
    }
    try {
      input[0] = args[0];
      input[1] = args[1];
      System.out.println("Congrats ... I am using your ARGS.");
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("A serious error has occured in the algorithm.");
      System.exit(0);
    }
    try {

    } catch (ArrayIndexOutOfBoundsException e) {}


    //AddNumArgs obj = new AddNumArgs();
    //
    //Need to check if args[] is empty
    //Need to check if args[2] is empty, this is good
    //Need to parse from strings to ... this becomes an algorithm
    //
    //int ansSum = obj.addNum(args[0], args[1]);
    //double ansDiv;
    /*
    try { //forcing division by zero, java.io has smrt response
      ansDiv = obj.divideNum(args[0], args[1]);
      //Execution will not continue if error in above line
      System.out.println("Excellent, you have not divided by zero");
    } catch(Exception e) {
      System.out.println("Please do not divide by zero.\n Answer formatted to 108");
      ansDiv = 108.0; //infinity
      System.out.printf("%.2f", ansDiv);
    }
    */
    //System.out.println("\nSum of two numbers is: " + ansSum + "\n");
    //System.out.println("\nDivision of two numbers is: " + ansDiv);
    //System.out.printf("%.2f", ansDiv);
  }
}
