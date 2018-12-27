package newdealQuiz.merge;

public class Program {
  public static void main(String[] args) {
    int a[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    int b[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};;
    int merge[] = new int[20];
    int i, j;
    
    for (i = 0; i < a.length; i++) {
      merge[i] = a[i];
    }
    
    for (j = i; j < merge.length; j++) {
      merge[j] = b[--i];
    }
    
    for (int k = 0; k < merge.length; k++) {
      for (int m = k+1; m < merge.length; m++) {
        if (merge[k] > merge[m]) {
          int temp = merge[m];
          merge[m] = merge[k];
          merge[k] = temp;
        }
      }
    }
    
    for (int n : merge) {
      System.out.print(n+" ");
    }
    
  }
}
