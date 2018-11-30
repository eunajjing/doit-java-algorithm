import java.util.Scanner;

public class AlgorithmQ16 {

  static void spira(int n) {
    for(int i=1; i<=n; i++) {
      for(int j = 0; j<n-i; j++) {
        System.out.print(" ");
      }
      for(int k=0; k <(i-1)*2+1; k++) {
        System.out.print("*");
      }
      for(int m = 0; m<n-i; m++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    spira(n);
  }

}
