    /**
 * Fun With Strings
 * Dylan Oberst and I worked together on this code
 * @author (Alexander Zimbalist) 
 * @version (11/19/2019)
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
        for (int i = 0; i < myName.length(); i++) 
        {
            System.out.println(myName.charAt(i));
        }   
    }

 
    /**
     * Determines if the given letter is a vowel.
     * @param ltr The letter to analyze
     * @return True if the letter is a vowel, false otherwise. Y will not be considered a vowel.
     */
    private static boolean isVowel(char ltr)
    {
        if(ltr=='a' || ltr=='A' || ltr=='e' || ltr=='E' ||
        ltr=='i' || ltr=='I' || ltr=='o' || ltr=='O' ||
        ltr=='u' || ltr=='U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Prints only the vowels in a given string (one per line). 
     * You must call your isVowel method in this method.
     * @param myName The string to analyze
     */
    public static void printVowels(String myName)
    {
            for (int i = 0; i < myName.length(); i++) 
            {
                if(isVowel(myName.charAt(i)) == true)
                {
                    System.out.println(myName.charAt(i));
                }
            }
    }

    /**
     * Returns a backwards copy of the original string.
     * @param original The original string to analyze
     * @return A backwards copy of the original string
     */
    public static String backwardsString (String original)
    {
        String reverse = "";
        for(int i = original.length() - 1; i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String myName)
    {
        if (backwardsString(myName).equals(myName))
        {
        return true;
    }
    else
    {
        return false;
    }
    }      
       
    /**
     * Returns a copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     * You should call your isVowel method in this method.
     * @param s The original String to process
     * @return A copy of the given String with all the vowels removed. (NOTE: y is not considered a vowel)
     */
    public static String removeVowels(String s)
    {
        String noVowels = "";
        for (int i = 0; i < s.length(); i++)
            
        if (isVowel(s.charAt(i)) == false)
            {
                noVowels = noVowels + s.charAt(i);
            }
            else
            {
                continue;
            }
            return "";
    }   
}
 

