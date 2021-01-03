public class Repeat
{
    public static String repeat(String word, int a)
    {
        String jeep = "";
        char[] str = word.toCharArray();
        for (int i = 0; i < word.length() ; i++)
        for ( int j=0 ; j<a ; j++)
        {
            jeep += str[i];
        }
        return jeep;
    }
}