public class AddNum {

  public int addNum (int numA, int numB) {
    return numA + numB;
  }

  public float divideNum (int numA, int numB) {
    return numA / numB;
  }

  public static void main(String args[]) {
    AddNum obj = new AddNum();

    int ansSum = obj.addNum(1, 2);
    float ansDiv = obj.divideNum(4, 2);

    System.out.println("\nSum of two numbers is: " + ansSum + "\n");
    System.out.println("\nDivision of two numbers is: " + ansDiv + "\n");
  }
}
