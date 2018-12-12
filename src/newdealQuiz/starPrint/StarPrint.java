package newdealQuiz.starPrint;

public class StarPrint {
  public StarPrint(int num) {
    for (int i = 0; i< num; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
