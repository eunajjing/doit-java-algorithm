package newdealQuiz.starPrint;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    System.out.println("별의 개수를 입력하세요.");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    new StarPrint(num);
  }
}
