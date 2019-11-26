public class AddNum {

  public int addNum (int numA, int numB) {
    return numA + numB;
  }

  public static void main(String args[]) {
    AddNum obj = new AddNum();

    int ans = obj.addNum(1, 2);

    System.out.println("\nSum of two numbers is: " + ans + "\n");
  }
}
