package newdealQuiz.searchInt;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수를 입력하세요 :");
    int x = Integer.parseInt(sc.nextLine()); 
    System.out.print("두번째 정수를 입력하세요 : ");
    int y = Integer.parseInt(sc.nextLine()); 
    
    Gcd gcd = new Gcd();
    System.out.println("최대공약수는 " + gcd.calc(x, y) + "입니다.");
  }

}
