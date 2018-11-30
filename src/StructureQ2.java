
public class StructureQ2 {

  public static void main(String[] args) {
    int[] arrayQ2 = new int[6];
    
    arrayQ2[0] = 5;
    arrayQ2[1] = 10;
    arrayQ2[2] = 73;
    arrayQ2[3] = 2;
    arrayQ2[4] = -5;
    arrayQ2[5] = 42;
    
    for (int i = 0; i < arrayQ2.length / 2 ; i++) {
      int temp = arrayQ2[i];
      arrayQ2[i] = arrayQ2[arrayQ2.length - i - 1] ;
      arrayQ2[arrayQ2.length - i - 1] = temp;
    }
    
    int sum = 0;
    for (int j = 0; j < arrayQ2.length ; j++) {
      sum += arrayQ2[j];
      System.out.println(arrayQ2[j]);
    }
    System.out.println("합계는 "+ sum);
    
  }

}
