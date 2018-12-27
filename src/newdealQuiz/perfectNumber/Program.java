package newdealQuiz.perfectNumber;

import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    PerfectNumber p = new PerfectNumber();
    Scanner sc = new Scanner(System.in);
    System.out.println("자연수를 입력하세요");
    int num = Integer.parseInt(sc.nextLine());
    if (num < 6) System.out.println("자연수가 없습니다.");
    else p.number(num);
  }

}
