public class ProfitableGamble
{
    public static double profitableGamble(int t1, int t2, int t3)
    {
        if ((t1 * t2) > t3)
        {
            System.out.println("true");
            return 1;
        }

        else
        {
            System.out.println("false");
            return 0;
        }
    }
}