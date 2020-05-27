package lab7;

public class KomparatorOdwrotnyStudenta implements Comparator
{
    private final Comparator komparator;
    public KomparatorOdwrotnyStudenta(Comparator komparator)
    {
        this.komparator = komparator;
    }

    public int compare(Object left, Object right) throws ClassCastException
    {
        return komparator.compare(right, left);
    }
}
