package anagram;

//Interface for AnagramChecker classes
public interface IAnagramChecker {

    /**
     * Boolean method to check if two words are anagrams to each other
     * @param word1 First word to check
     * @param word2 Second word to check
     * @return Returns true if words are anagrams
     */
    boolean isAnagram(String word1, String word2);
}
