public class IsStrangePair
{
    public static boolean isStrangePair (String word1, String word2)
    {
        boolean Do = false;
        int i = word2.length()-1;
        int j = word1.length()-1;
        if (word1.charAt(0)== word2.charAt(i) && word2.charAt(0)==word1.charAt(j))
        {
            Do = true;
        }
        return Do;

        /*return word1.charAt(0) == word2.charAt(word2.length() - 1) &&
                word2.charAt(0) == word2.charAt(word1.length() - 1);

         */
    }
}