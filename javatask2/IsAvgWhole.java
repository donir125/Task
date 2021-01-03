public class IsAvgWhole
{


    public static boolean isAvgWhole(int kol, int[] array)
    {
        int sum = 0;

        for (int i = 0; i < kol; i++)
        {
            sum += array[i];
        }
        if ((sum % kol) % 100 < 1)
        {
            return true;
        } else

            return false;

    }
}