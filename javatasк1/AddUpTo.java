public class AddUpTo
{
    public static int addUpTo(int m)
    {
        int summ = 0;


        for(int i = 1; i < (m + 1); i++)
        {
            summ = summ + i;
        }

        return summ;
    }
}