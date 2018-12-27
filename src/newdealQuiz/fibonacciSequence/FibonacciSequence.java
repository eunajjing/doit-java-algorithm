package newdealQuiz.fibonacciSequence;

public class FibonacciSequence {
  void calc(int number) {
    int[] fibonacciSeq = new int[100];
    
    fibonacciSeq[0] = 0;
    fibonacciSeq[1] = 1;
    
    for (int i = 2; i<fibonacciSeq.length; i++) {
      fibonacciSeq[i] = fibonacciSeq[i-2] + fibonacciSeq[i-1];
    }
    
    System.out.println("피보나치 "+number+"번째 수는 "+fibonacciSeq[number]+" 입니다.");
    
  }

}
