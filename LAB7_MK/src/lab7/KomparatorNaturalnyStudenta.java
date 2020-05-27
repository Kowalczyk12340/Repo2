package lab7;

public class KomparatorNaturalnyStudenta implements Comparator
{
    public int compare(Object left, Object right) throws ClassCastException
    {
        return ((Student) left).compareTo(right);
    }
}
