public class IsPrefixSuffix
{
   /*
   public static boolean isPrefix(String str1, String str2)

    {
        boolean Do = false;
        for (int i = 0; i < str1.length()-1; i++)
        {
            for (int j = 0; j < str2.length()-1; i++)
            {
                if (str1.charAt(i) == str2.charAt(j))
                {
                    Do = true;
                }
                else
                    {
                    Do = false;
                    break;
                    }
            }
        }
        return Do;


    }

    public static boolean isSuffix(String str1, String str2)
    {
        boolean Do = false;
        for (int i = str1.length()-1; i >(str1.length()-1)-(str2.length()-1); i--)
        {
            for (int j = str2.length() - 1; j > 0; j--)
            {
                if (str1.charAt(i) == str2.charAt(j))
                {
                    Do = true;
                }
                else
                {
                    Do = false;
                    break;
                }
            }

        }
        return Do;


    }
    */

    public static boolean isPrefix(String word, String pref)
    {
        pref =  pref.substring(0,  pref.length()-1);
        return word.startsWith(pref);
    }

    public static boolean isSuffix(String word, String suf)
    {
        suf = suf.substring(1);
        return word.endsWith(suf);
    }



}

