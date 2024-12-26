package DicLib ;

import java.util.TreeMap;

public class WordDictionary {
    // TreeMap to store words and their meanings
    private TreeMap<String, String> dictionary = new TreeMap<>();

    // Method to add a word with its meaning
    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning); // Automatically handles sorting
    }

    // Method to print all words and their meanings
    public void printDictionary() {
        System.out.println("Words in the Dictionary (English -> Arabic):");
        for (String word : dictionary.keySet()) {
            System.out.println(word + " -> " + dictionary.get(word));
        }
    }


    
}
