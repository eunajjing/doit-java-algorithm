package newdealQuiz;

import java.util.Scanner;

public class StrngCheck {

  static boolean lengthCheck(String jumin) {
    boolean result = false;
    if (jumin.length() == 14) {
      result = true;
    }
    return result;
  }

  static boolean valueCheck(String jumin) {
    int i = jumin.charAt(7);
    int j = jumin.charAt(7) - '0';
    System.out.println(j);
    boolean result = false;
    if (i <= 4 && i != 0) {
      result = true;
    }
    return result;
  }

  static void print(String jumin) {
    if (jumin.charAt(7) == 1 || jumin.charAt(7) == 3) {
      System.out.println("남성");
    } else {
      System.out.println("여성");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String jumin;
    while (true) {
      System.out.println("주민번호 입력");
      jumin = sc.nextLine();
      if (lengthCheck(jumin)) {
        if (valueCheck(jumin)) {
          print(jumin);
          break;
        } else {
          System.out.println("알 수 없는 성별");
        }
      } else {
        System.out.println("유효하지 않은 번호");
      }
    }

  }
}
