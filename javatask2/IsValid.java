public class IsValid
{

    public static boolean isValid(String ind)
    {
        if(ind.length() != 5)
        {
            return false;
        }
        for (int i = 0; i < ind.length(); i++)
        {
            if (!Character.isDigit(ind.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}