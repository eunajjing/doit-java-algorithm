package newdealQuiz.robot;

import java.util.Scanner;

public class Robot {
  
  static int walk(int n) {
    
    int result = 0;
    
    if (n == 1 || n == 2) {
      result = n;
    } else {
      result = walk(n-1) + walk(n-2);
    }
    
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("로봇이 걸어갈 거리를 입력해주세요.>>");
    int n = Integer.parseInt(sc.nextLine());
    System.out.println("경우의 수 " + walk(n)+" 개"); 

  }

}
