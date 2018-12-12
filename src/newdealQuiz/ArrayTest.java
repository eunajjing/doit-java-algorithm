package newdealQuiz;

public class ArrayTest {

  public static void main(String[] args) {
    int[] score = new int[] {79,88,97,54,56,95};
    int max = score[0]; //79
    int min = score[0]; //79
    
    for (int i = 1; i< score.length; i++) {
      if (max < score[i]) {
        max = score[i];
      }
      if (min > score[i]) {
        min = score[i];
      }
    }
    
    System.out.println("수학과 학생들의 기말고사 시험 점수 최대점은 "+max);
    System.out.println("수학과 학생들의 기말고사 시험 점수 최하점은 "+min);
    
    int sum=0;
    float average = 0f;
    int[] jumsu = {100,55,90,60,78};
    
    for (int j = 0; j<jumsu.length; j++) {
      sum += jumsu[j];
      if (j == jumsu.length-1) {
        average = (float) sum/jumsu.length;
        break;
      }
    }
    
    System.out.println("총 과목 수는 "+jumsu.length);
    System.out.println("점수의 합은 "+sum);
    System.out.println("점수의 평균은 "+average);
  }

}
