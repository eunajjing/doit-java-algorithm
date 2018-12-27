import java.util.Calendar;
import java.util.Scanner;

// 푸는 중
class AlgorithmQ11Cal {
  int y, m, d;
  Calendar cal;
  
  public AlgorithmQ11Cal(int y, int m, int d) {
    this.y = y;
    this.m = m;
    this.d = d;
    cal = Calendar.getInstance();
  }
  
  int afterDay(int n) {
    cal.set(y, m, d);
    cal.add(Calendar.DAY_OF_YEAR, n);
    System.out.println(cal.toString());
    //System.out.println(cal.get(DAY_OF_MONTH));
    return Calendar.DAY_OF_MONTH;
  }
  
  int beforeDay(int n) {
    return 0;
  }
}

public class AlgorithmQ11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("년도를 입력하세요.");
    int y = sc.nextInt();
    System.out.println("월을 입력하세요.");
    int m = sc.nextInt();
    System.out.println("일을 입력하세요.");
    int d = sc.nextInt();
    AlgorithmQ11Cal alCal = new AlgorithmQ11Cal(y, m, d);
    System.out.println("며칠 뒤를 구할까요?");
    int before = sc.nextInt();
    int result = alCal.afterDay(before);
    System.out.println(result);
  }
}
