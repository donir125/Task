public class BoxSeq
{
    public static int boxSeq(int shag)
    {
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++)
        {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }

}