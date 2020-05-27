package lab7;

public class KomparatorImieStudenta implements Comparator
{
    public int compare(Object left, Object right) throws ClassCastException
    {
        return ((Student)left).getImie().compareTo(((Student)right).getImie());
    }
}
