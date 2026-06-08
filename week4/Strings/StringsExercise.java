//Sheri Evangelene
//Week 4 exercises-Java
//May 25-June 10, 2026

import java.util.Arrays;

public class StringsExercise {    
    
    //How to Print duplicate characters from String?
    public void printDuplicate(String word){
        for(int i= 0; i < word.length(); i++){
            char c = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++){
                if (c == word.charAt(j)){
                    count++;
                }
            }
            if (count > 1) {
        System.out.println(c + " appears " + count + " times");
}
        }
      
}

    //How to check if two Strings are anagrams of each other?
    public void anagrams(String word1, String word2){
        char[] arr1 = word1.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = word2.toLowerCase().toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("The words are anagrams");
        }else{
            System.out.println("The words are not anagrams");
        }
    }

    //How to program to print first non-repeated character from String?
    public void nonRepeatingChar(String word){
        for(int i= 0; i < word.length(); i++){
            char c = word.charAt(i);
            int count = 0;
            for (int j = 0; j < word.length(); j++){
                if (c == word.charAt(j)){
                    count++;
                }
            }
                if (count == 1){
                    System.out.println("The first non-repeating char is: " + c); 
                return;                   
            }
    }
}  

    //How to reverse String in Java using Iteration and Recursion?
    public void reverseString(String word){
        String reversed = "";
        for(int i= word.length() - 1; i >= 0; i--){
             reversed += word.charAt(i);
        }
         System.out.println(reversed);
    }

    //How to check if a String contains only digits?
    public void onlyDigits(String word){
        if (word.matches("[0-9]+")){
            System.out.println(word + " contains only digits");
        }else{
            System.out.println(word + " does not contain only digits");
        }
    }

    //How to count number of vowels and consonants in a String?
    public void vowelOrConsonant(String word){
        
    }
 

public static void main(String args[]) {

    StringsExercise se = new StringsExercise();
    se.printDuplicate("Java");
    System.out.println();

    se.anagrams("Army", "Mary");
    System.out.println();

    se.nonRepeatingChar("Morning");
    System.out.println();

    se.reverseString("Thanks Pixel!");
    System.out.println(); 
    
    se.onlyDigits("12345");
    se.onlyDigits("12a45");
    System.out.println();
}


}
