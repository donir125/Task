public class AbcMath
{
    public static boolean abcMath(int a, int b, int c)
    {

        int summ = a;

        for (int i = 0; i < b; i++)
        {

            summ = 2 * summ;
        }

        if ((summ % 10) == 0)
        {

            return true;

        }

        else
        {

            return false;

        }
    }
}