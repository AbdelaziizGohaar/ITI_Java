import DicLib.AlphapaticMap;
import DicLib.WordDictionary;

public class Test {
    
public static void main(String[] args) {
 
 //   AlphapaticMapbeticWordMap wordMap = new AlphabeticWordMap();
    AlphapaticMap wordMap = new AlphapaticMap();

    // Adding some sample words
    wordMap.addWord("Apple");
    wordMap.addWord("Ant");
    wordMap.addWord("Banana");
    wordMap.addWord("Ball");
    wordMap.addWord("Cat");
    wordMap.addWord("Car");

    // Print all words
    System.out.println("All Words:");
    wordMap.printAllWords();

    // Print words by letter
    System.out.println("\n Words for letter 'A':");
    wordMap.printWordsByLetter('A');

    System.out.println("\n Words for letter 'B':");
    wordMap.printWordsByLetter('B');

    System.out.println("\n Words for letter 'Z':");
    wordMap.printWordsByLetter('Z');
//////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////// 
 
 WordDictionary wordDictionary = new WordDictionary();
        
        wordDictionary.addWord("Union", "نقابة"); 
        wordDictionary.addWord("Apple", "تفاحة");
        wordDictionary.addWord("Banana", "موز");
        wordDictionary.addWord("Cherry", "كرز");     
        wordDictionary.addWord("Apple", "تفاحة");
        wordDictionary.addWord("Banana", "موز");
        wordDictionary.addWord("Cherry", "كرز");
        wordDictionary.addWord("Dog", "كلب");
        wordDictionary.addWord("Elephant", "فيل");
        wordDictionary.addWord("Frog", "ضفدع");
        wordDictionary.addWord("Grapes", "عنب");
        wordDictionary.addWord("Horse", "حصان");
        wordDictionary.addWord("Ice", "ثلج");
        wordDictionary.addWord("Jelly", "هلام");
        wordDictionary.addWord("Kite", "طائرة ورقية");
        wordDictionary.addWord("Lion", "أسد");
        wordDictionary.addWord("Monkey", "قرد");
        wordDictionary.addWord("Notebook", "دفتر");
        wordDictionary.addWord("Orange", "برتقال");
        wordDictionary.addWord("Pineapple", "أناناس");
        wordDictionary.addWord("Queen", "ملكة");
        wordDictionary.addWord("Rabbit", "أرنب");
        wordDictionary.addWord("Snake", "ثعبان");
        wordDictionary.addWord("Tiger", "نمر");
        wordDictionary.addWord("Umbrella", "مظلة");
        wordDictionary.addWord("Van", "شاحنة صغيرة");
        wordDictionary.addWord("Watermelon", "بطيخ");
        wordDictionary.addWord("Zebra", "حمار وحشي");

     
        wordDictionary.printDictionary();
        // Print updated dictionary
        //wordDictionary.printDictionary();
     





}

}