package DicLib ;

import java.util.TreeMap;

public class WordDictionary {
 
    private TreeMap<String, String> dictionary = new TreeMap<>();

 
    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning); 
    }

    // Method to print all words and their meanings
    public void printDictionary() {
        System.out.println("Words in the Dictionary (English -> Arabic):");
        for (String word : dictionary.keySet()) {
            System.out.println(word + " -> " + dictionary.get(word));
        }
    }

    
}
