// YOU CANNOT MODIFY THIS FILE
// input the row number you need as the command-line argument
public class PascalTriangleDriver {

  public static void main(String args[]) {

    int k=0;
    try { 
      k = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.out.println("You have to input an integer as argument.");
      System.exit(1);
    }

    int arr[] = PascalTriangle.computePT(k);

    for (int i = 0; i < arr.length; i++)
      System.out.print(arr[i] + " ");

    System.out.println();
  }
}
