package newdealQuiz.arrTest;

public class Arr {
  void select(int[] arr) {
    int one = arr[0];

    for (int i = 1; i < arr.length; i++) {
      System.out.println(one+"와 "+arr[i]+" 비교");
      if (one > arr[i]) {
        int temp = arr[i];
        arr[i] = one;
        one = temp;
      } else {
        
        System.out.println("현재 PASS");
      }
    }
    System.out.println();
    for (int j : arr) {
      System.out.print(j+" ");
    }
    
  }
  
  void bubble(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        System.out.println(arr[i]+"와 "+arr[j]+" 비교");
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        } else {
          System.out.println("현재 PASS");
        }
      }
    }
    System.out.println();
    for (int k : arr) {
      System.out.print(k+" ");
    }
  }
}
