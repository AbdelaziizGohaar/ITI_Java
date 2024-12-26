package DicLib ;

import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class AlphapaticMap {
    
    SortedMap<String, Integer> alphapaticMap = new TreeMap<>();
    // SortedMap<String, Integer> wordMap = new TreeMap<>(); 
        private SortedMap<Character, TreeSet<String>> wordsMap;

  public AlphapaticMap()
  {
    alphapaticMap = null;
   /// WordMap word = new WordMap();
  /////////////////////////////////
  /////////////////////////////////////  
    wordsMap = new TreeMap<>();
    // Initialize map with all alphabets
    for (char c = 'A'; c <= 'Z'; c++) {
        wordsMap.put(c, new TreeSet<>());
    }
  }

  public void addWord(AlphapaticMap alphaMap , String wKey , String wVal )
  {
     

  }

  
   public void addWord(String word) {
    if (word == null || word.isEmpty()) return;

    char key = Character.toUpperCase(word.charAt(0)); // Use the first letter as key
    if (wordsMap.containsKey(key)) {
        wordsMap.get(key).add(word);
    }
}


public void printAllWords() {
    for (char key : wordsMap.keySet()) {
        System.out.println(key + ": " + wordsMap.get(key));
    }
    System.out.println("\n =======================================================================");
}


public void printWordsByLetter(char letter) {
    char key = Character.toUpperCase(letter);
    if (wordsMap.containsKey(key)) {
        System.out.println(key + ": " + wordsMap.get(key));
        System.out.println("\n =======================================================================");
    } else {
        System.out.println("No words found for the letter: " + letter);
    }
 
}

}


