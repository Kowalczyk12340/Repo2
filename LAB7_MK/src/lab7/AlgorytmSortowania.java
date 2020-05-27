package lab7;

public abstract class AlgorytmSortowania implements ListSorter
{
    protected final Comparator komparator;
    protected Statystyka statystyka;

    public AlgorytmSortowania(Comparator komparator)
    {
        this.komparator = komparator;
        statystyka = new Statystyka();
    }

    protected int porownaj(Object[] tab, int lewy, int prawy)
    {
        return porownaj(tab[lewy], tab[prawy]);
    }

    protected int porownaj(Object lewy, Object prawy)
    {
        statystyka.porownanie();
        return  komparator.compare(lewy, prawy);
    }

    protected void zamien(Object[] tab, int lewy, int prawy)
    {
        statystyka.zamiana();
        Object tmp = tab[lewy];
        tab[lewy] = tab[prawy];
        tab[prawy] = tmp;
    }
    protected void wstaw(Object[] tab, Object co, int gdzie)
    {
        tab[gdzie] = co;
        statystyka.zamiana();
    }
    protected void wstaw(Object[] tab, int ktory, int gdzie)
    {
        wstaw(tab, tab[ktory], gdzie);
    }
    public boolean testuj(Object[] tab)
    {
        for(int i = 0; i<tab.length; i++)
        {
            Object previous = tab[i];
            if(komparator.compare(previous, tab[i])>0)
                return false;
            previous = tab[i];
        }
        return true;
    }
}
