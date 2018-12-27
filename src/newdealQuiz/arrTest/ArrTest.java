package newdealQuiz.arrTest;

public class ArrTest {
  public static void main(String[] args) {
    int[] array = {3, 4, 2, 5, 1};
    Arr arr = new Arr();
 
    System.out.println("선택정렬입니다:");
    arr.select(array);
    System.out.println();
    System.out.println();
    System.out.println("버블정렬입니다:");
    arr.bubble(array);
  }

}
