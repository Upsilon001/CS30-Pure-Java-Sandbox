import java.io.*;

public class AddNumArgs {

  public int addNum (int numA, int numB) {
    return numA + numB;
  }

  public double divideNum (double numA, double numB) {
    return numA / numB;
  }

  public static void main(String args[])
  throws IOException
  {
    AddNum obj = new AddNum();
    //
    //Need to check if args[] is empty
    //Need to check if args[2] is empty, this is good
    //Need to parse from strings to ... this becomes an algorithm
    //
    int ansSum = obj.addNum(args[0], args[1]);
    double ansDiv;
    try { //forcing division by zero, java.io has smrt response
      ansDiv = obj.divideNum(args[0], args[1]);
      //Execution will not continue if error in above line
      System.out.println("Excellent, you have not divided by zero");
    } catch(Exception e) {
      System.out.println("Please do not divide by zero.\n Answer formatted to 108");
      ansDiv = 108.0; //infinity
      System.out.printf("%.2f", ansDiv);
    }
    System.out.println("\nSum of two numbers is: " + ansSum + "\n");
    System.out.println("\nDivision of two numbers is: " + ansDiv);
    //System.out.printf("%.2f", ansDiv);
  }
}
