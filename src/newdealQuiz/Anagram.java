package newdealQuiz;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

  boolean anagramCheck(String first, String second) {

    boolean result = false;
    int[] ref;

    if (first.length() != second.length()) {
      return result;
      
    } else {
      
      ref = new int[first.length()];
      
      Map<Character, Object> firstMap = new HashMap<>();

      for (int i = 0; i < first.length(); i++) {
         firstMap.put(first.charAt(i), first.indexOf(i));
         ref[i] = i;
      }
      
      Map<Character, Object> secondMap = new HashMap<>();
      
      for (int j = 0; j < second.length(); j++) {
        secondMap.put(second.charAt(j), second.indexOf(j));
        
        if (firstMap.containsKey(second.charAt(j))) {
          firstMap.get(second.charAt(j));
        } 
      }
      
      
      
    }

    return false;
  }

}
