import java.util.ArrayList;

public class Digits
{
    /**
     * The list of digits from the number used to construct this object.
     * The digits appear in the list in the same order in which they appear in the original number.
     */
    private ArrayList<Integer> digitList;

    /**
     * Constructs a Digits object that represents num.
     * PRECONDITION: num >= 0
     */
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        if (num == 0)
        {
            digitList.add(0);
        }
        while (num >0)
        {
            digitList.add(0, num % 10);
            num /= 10;
        }
    }

    // GETTER METHOD: added to enable test code (not provided in original FRQ)
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

    /**
     * Returns true if the digits in this Digits object are in strictly increasing order;
     * false otherwise.
     */
    public boolean isStrictlyIncreasing()
    {
        for (int x = 0; x < digitList.size() - 1; x++)
        {
            if( digitList.get(x) >= digitList.get(x + 1))
            {
                return false;
            }
        }
        return true;
    }
}
