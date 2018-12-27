package newdealQuiz.perfectNumber;

public class PerfectNumber {

  int resultIndex = 0;

  void number(int num) {

    for (int i = 1; i <= num; i++) { // num보다 작은 완전수를 구할 것
      int index = 0; // 약수 개수 구할 index
      for (int j = 1; j <= i; j++) { // num보다 작은 수를 하나씩 돌리며 완전수인지 여부 검증 시작, 일단 약수 구하기
        if (num % j == 0) {
          if (num == j) continue;
          else ++index;
        }
      }
      int[] intArray = new int[index]; // 약수를 담을 배열을 만든다.
      
      for (int k = 1; k <= i; k++) { // 약수를 배열에 담는다.
        if (num % k == 0) {
          if (num == k) continue;
          else intArray[--index] = k;
        }
      }
      int sum = 0;
      for (int l : intArray) { // 약수를 더해본다.
        sum += l;
    }
      if (sum == num) {
        System.out.println(sum);
        resultIndex++;
      }
  }
    System.out.println(resultIndex);
  }
}
      
      
      
      /*int sum = 0;
      for (int k = 0; k < intArray.length; k++) {
        System.out.println("세번째 for문 도달 "+k);
        sum += intArray[k];
      }
      if (sum == num) {
        System.out.println("합계가 같은지 검사");
        resultArrayIndex++;
      }
    }
    if (resultArrayIndex != 0) {
    resultArray = new int[--resultArrayIndex];
    }
    for (int i = 1; i < num; i++) {
      int index = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          index++;
        }
      }
      int[] intArray = new int[--index];
      int sum = 0;
      for (int k = 0; k < intArray.length; k++) {
        sum += intArray[k];
      }
      if (sum == num) {
        resultArray[resultArrayIndex2] = i;
      }

    }
    print();
  }*/
/*void print() {
  System.out.println("자연수는");
  for (int i : resultArray) {
    System.out.print(i+" ");
  }
}*/
  
