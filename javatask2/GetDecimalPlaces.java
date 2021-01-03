public class GetDecimalPlaces
{

        public static int getDecimalPlaces(String number)
        {
            int sub = 0;
            for ( int i=0 ; i<number.length(); ++i)
        if (number.charAt(i)=='.')
        {
            sub = number.length()-i-1;
            break;
        }
        return sub;
        }
}