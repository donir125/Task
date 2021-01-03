public class Fibonacci
{
        public static int fibonacci (int n)
        {
            switch (n)
          {
            case 0:
            case 1:
            return 1;
            default:
            return fibonacci(n - 2) + fibonacci(n - 1);
          }
        }
    /* public static int fibonacci (int ch)
    {
        int v1 = 0;
        int v2 = 0;
        int sum = 0;
        for (int i=1; i<=ch; i++)
        {
            sum = v1+v2;
            v1 = v2;
            v2 = sum;
        }
        return sum;
    }

     */
}