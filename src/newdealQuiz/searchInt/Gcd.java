package newdealQuiz.searchInt;

public class Gcd {
  int calc(int x, int y) {
    int a;
    int b;
    int index = 0;
    
    if (x > y) {
      a = x;
      b = y;
    } else  {
      a = y;
      b = x;
    } 
    
    for (int i = 2; i <= y; i++) {
      if (a % i == 0 && b % i == 0) {
        index = i;
      }
    }
    
    return index;
  }
}
