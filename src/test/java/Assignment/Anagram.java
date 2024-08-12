package Assignment;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        String word1 = "race";
        String word2 = "caee";

        if (word1.length() == word2.length()) {
            char[] charArray1 = word1.toCharArray();
            char[] charArray2 = word2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray2, charArray1)) {
                System.out.println(word1 + " and " + word2 + " are anagrams.");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagrams.");
            }
        } else {
            System.out.println(word1 + " and " + word2 + " are not anagrams.");
        }
    }    }
