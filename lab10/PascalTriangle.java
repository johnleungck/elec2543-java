public class PascalTriangle {

  public static int[] computePT(int k) {
    int[] pt_row = new int[k];
    if (k == 1) {
      pt_row[0] = 1;
        return pt_row;
    } 
    else {
      int[] pt_rec = computePT(k-1);
      pt_row[0] = 1;
      pt_row[k-1] = 1;
      for (int i = 1; i < pt_rec.length; i++) {
        pt_row[i] = pt_rec[i-1] + pt_rec[i];
        }
    }
    return pt_row;
  }
}
