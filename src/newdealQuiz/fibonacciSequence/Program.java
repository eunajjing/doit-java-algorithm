package newdealQuiz.fibonacciSequence;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("100번째까지의 피보나치 수를 지니고 있습니다.");
    System.out.println("몇 번째 피보나치 수가 궁금한가요?");
    int number = Integer.parseInt(sc.nextLine());
    FibonacciSequence sequence = new FibonacciSequence();
    sequence.calc(number);

  }

}
