    /**
 * Fun With Strings
 * 
 * @author (Your Name Goes Here) 
 * @version (11/15/2019)
 */
public class StringFun
{
    // Your task is to successfully implement each method in this class. Work from the top of this class to the bottom.

    /**
     * Prints each letter of a given string (one per line).
     * @param myName A string to analyze
     */
    public static void printEachLetter(String myName)
    {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));}   
    }

 
    /**
     * Determines if the given letter is a vowel.
     * @param ltr The letter to analyze
     * @return True if the letter is a vowel, false otherwise. Y will not be considered a vowel.
     */
    private static boolean isVowel(char ltr)
    {
        // replace the body of this method
        return false;
    }

    /**
     * Prints only the vowels in a given string (one per line). 
     * You must call your isVowel method in this method.
     * @param myName The string to analyze
     */
    public static void printVowels(String myName)
    {
        // your code goes here
    }

    /**
     * Returns a backwards copy of the original string.
     * @param original The original string to analyze
     * @return A backwards copy of the original string
     */
    public static String backwardsString (String original)
    {
        // replace the body of this method
        return "";
    }

    /**
     *  Returns true if the given String is a palindrome (reads the same
     *  forwards and backwards (example: "racecar"). This method should
     *  be case sensitive (e.g. "Racecar" is not a palindrome but "RacecaR" is).
     *  You should call your backwardsString method in this method.
     **/
    public static boolean isPalindrome(String myName)
    {
        // replace the body of this method
        return true;
    }      
       
    /**
     * Returns a copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     * You should call your isVowel method in this method.
     * @param s The original String to process
     * @return A copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     */
    public static String removeVowels(String s)
    {
        // replace the body of this method
        return "";
    }   
}
