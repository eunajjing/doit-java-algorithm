// 푸는 중!

package newdealQuiz.word;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("단어 입력!");
    String word = sc.nextLine().trim();
    char result = 0;

    Map<String, Object> charMap = new TreeMap<>();
    char[] charArray = new char[word.length()];

    for (int j = 0; j < word.length(); j++) {
      String keyTemp = String.valueOf(word.charAt(j));
      charMap.put(keyTemp, 0);
      charArray[j] = word.charAt(j);
    }

    for (int i = 0; i < charArray.length; i++) {
      if (charMap.containsKey(String.valueOf(charArray[i]))) {
        charMap.put(String.valueOf(charArray[i]), charMap.get(String.valueOf(charArray[i]) + 1));
      }
    }

    for (int k = 0; k < charArray.length; k++) {
      //System.out.println(charMap.get(String.valueOf(charArray[k])));
      for (int l = k+1; l< charArray.length; l++) {
        //System.out.println(charMap.get(String.valueOf(charArray[k])));
        //System.out.println(charMap.get(String.valueOf(charArray[l])));
        
        /*if ((int) charMap.get(String.valueOf(charArray[k])) == (int) charMap.get(String.valueOf(charArray[l]))) {
          result = '?';
        } else if ((int) charMap.get(String.valueOf(charArray[k])) > (int) charMap.get(String.valueOf(charArray[l]))) {
          result =  charArray[k];
        } else {
          result =  charArray[l];
        }*/
      }
    }
    
    System.out.println(result);
    
  }

}
