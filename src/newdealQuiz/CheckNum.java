package newdealQuiz;

import java.util.Scanner;

public class CheckNum {
  public static void main(String[] args) {
    int mainNum;
    Scanner sc = new Scanner(System.in);
    int qNum;
    String yesOrNo;

    while(true) {
      mainNum = (int) (Math.random() * 100);
      System.out.println("랜덤 숫자 맞추기 게임을 시작합니다.");
      System.out.println("숫자는 0 - 99 사이입니다.");
      System.out.println("숫자 입력 후, 엔터를 눌러주세요.");
      qNum = sc.nextInt();
      
      if (0 <= qNum && qNum <= 99) {
        if (mainNum < qNum) {
          System.out.println("더 낮게");
        } else if (mainNum > qNum) {
          System.out.println("더 높게");
        } else {
          System.out.println("축하합니다! 답은 " + mainNum);
          System.out.println("계속하시겠습니까? y / n");
          yesOrNo = sc.next();
          if (yesOrNo.equalsIgnoreCase("n")) {
            break;
          } else {
            continue;
          }
        }
      } else {
        System.out.println("범위를 벗어났습니다. 다시 입력해주세요.");
      }
    }
  }
}
