import java.util.Scanner;

public class AlgorithmQ15 {

  static void triangleLB(int n) {
    for(int i = 0; i <n ; i++) {
      for(int j = 0; j <= i ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void triangleLU(int n) {
    for(int i = 0; i < n ; i++) {
      for(int j = n; j > i ; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  static void triangleRU(int n) {
    for(int i = 0; i < n ; i++) {
      for(int k=1; k<=i; k++) {
        System.out.print(" ");
      }
      for(int j = n; j > i ; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    System.out.println("왼쪽 아래가 직각인 삼각형");
    triangleLB(n);
    System.out.println("왼쪽 위가 직각인 삼각형");
    triangleLU(n);
    System.out.println("오른쪽 위가 직각인 삼각형");
    triangleRU(n);
  }
}
