/*public class FindLargest{
    public static Comparable FindLargest(Comparable[] arr){
        if (arr.length == 0){
            return null;
        }
        Comparable largest = arr[0];
        for (int i = 0; i < arr,length; i++){
            if (arr[i].compareTo(largest) > 0){
                largest = arr[i];
            }
        }
        return largest;
    }
}*/
public class FindLargest {
    public static <T extends Comparable<? super T>> T findLargest(T[] arr) {
        if (arr.length == 0) {
            return null;
        }
        T largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
            }
        }
        return largest;
    }
}