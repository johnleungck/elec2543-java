// YOU CANNOT MODIFY THIS FILE

public class BinarySearchDriver {

  public static void main(String args[]) {

    Integer[] arr = new Integer[10];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }

    for (int i = -2; i < arr.length+2; i++) {

	if (BinarySearch.search(arr, i) != null) {
	   System.out.println(i + " is in the array.");
        }
	else
	   System.out.println(i + " is not in the array.");
    }
    
  }
}
