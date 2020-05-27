package lab7;

public class KomparatorNazwiskoStudenta implements Comparator
{
    public int compare(Object left, Object right) throws ClassCastException
    {
        return ((Student)left).getNazwisko().compareTo(((Student)right).getNazwisko());
    }
}
