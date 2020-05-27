package lab7;

public class KomparatorZlozonyStudenta implements Comparator
{
    private final ListaJednokierunkowa komparatory = new ListaJednokierunkowa();
    public void dodaj(Comparator nowy)
    {
        komparatory.add(nowy);
    }

    public int compare(Object left, Object right) throws ClassCastException
    {
        int result = 0;
        Iterator it = new IteratorJednokierunkowy(komparatory);
        for(it.first();
            !it.isDone() && (result=((Comparator)it.current()).compare(left,right))==0;
            it.next());
        return result;
    }
}

