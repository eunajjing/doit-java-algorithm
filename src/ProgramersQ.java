
public class ProgramersQ {

  static int solution(int n) {
    int min = n;
    int k = 0;
    int[] oneTwoFour = {0, 1, 2, 4};
    while(min != 1) {
      k++;
      min = (min / 3);
    }
    k++;
    
    int[] result = new int[k];
    
    while(k > 0) {
      result[--k] = n % 3;
      n = n / 3;
    }
    
    System.out.println("답은?");
    for (int i : result) {
      System.out.print(i );
    }
    
    return 0;
  }

  public static void main(String[] args) {
    int result = solution(3);
    // 6부터 안됨
  }

}
