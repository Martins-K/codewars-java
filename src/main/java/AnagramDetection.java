import java.util.Arrays;

public class AnagramDetection {

    /*
    An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).
    Note: anagrams are case insensitive
    Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
    Examples
    "foefet" is an anagram of "toffee"
    "Buckethead" is an anagram of "DeathCubeK"
    */
    public static boolean isAnagram(String test, String original) {
        char[] testChars = test.toCharArray();
        Arrays.sort(testChars);
        String testSorted = new String(testChars);

        return false;
    }
}
