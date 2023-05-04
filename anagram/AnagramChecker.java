package anagram;

import java.util.Arrays;

/**
 * Class that implements IAnagramChecker interface,
 * It is meant to check if two words are anagrams
 */
public class AnagramChecker implements IAnagramChecker{
    @Override
    public boolean isAnagram(String word1, String word2) {

        char []firstWordArray = word1.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        char []secondWordArray = word2.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        Arrays.sort(firstWordArray);
        Arrays.sort(secondWordArray);
        return Arrays.equals(firstWordArray, secondWordArray);
    }
}
