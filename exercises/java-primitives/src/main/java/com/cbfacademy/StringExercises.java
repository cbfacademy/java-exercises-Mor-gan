package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        return new String(characters);
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}
        long count = 0;
        char targetCharacter = character.charValue();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == targetCharacter) {
                count++;
            }
        }
        return count;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        int length = word.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return word.equals(reverse);
    }
    public String getName() {
        return "String Exercises";
    }
}
