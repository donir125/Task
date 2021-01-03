public class DifferenceMaxMin
{
    public static int differenceMaxMin(int v ,int[] array)
    {
        int sub = 0;
        int max = array[0];
        int min = array[0];
        for (int i=0; i< v ;i++)
        {
            if (max< array[i])
                max =  array[i];
        }
        for (int i=0; i<v ;i++)
        {
            if (min > array[i])
                min =  array[i];
        }
        sub = max - min;
        return (sub);
    }
}