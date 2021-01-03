public class CumulativeSum
{
    public static int[] cumulativeSum( int kol,int[] array)
    {
        int[] a = new int[kol];
        a[0] = array[0];
        int sum = array[0];
        for (int i = 1; i < kol; i++)
        {
            sum += array[i] ;
            a[i] = sum;

        }
        return (a);
    }
}