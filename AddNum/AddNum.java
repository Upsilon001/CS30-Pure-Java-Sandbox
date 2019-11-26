import java.io.*;

public class AddNum {

  public int addNum (int numA, int numB) {
    return numA + numB;
  }

  public float divideNum (int numA, int numB) {
    return numA / numB;
  }

  public static void main(String args[])
  throws IOException
  {
    AddNum obj = new AddNum();
    int ansSum = obj.addNum(1, 2);
    float ansDiv;
    try {
      ansDiv = obj.divideNum(4, 0);
    } catch(Exception e) {
      System.out.println("Please do not divide by zero.");
      ansDiv = 108; //infinity
    }
    System.out.println("\nSum of two numbers is: " + ansSum + "\n");
    System.out.println("\nDivision of two numbers is: " + ansDiv + "\n");
  }
}
