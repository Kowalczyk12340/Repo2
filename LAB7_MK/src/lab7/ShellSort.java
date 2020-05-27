package lab7;

public class ShellSort extends InsertSort
{
    public ShellSort(Comparator komparator)
    {
        super(komparator);
    }

    private final int przyrosty[] = {1093, 364, 121, 40, 13, 4, 1};// wartości przyjete z wykladu od dr. Szpunara

    public Object[] sort(Object[] tab, int ileElementow)
    {

        Object[] tab1 = new Object[ileElementow];
        for(int i = 0; i< ileElementow; i++)
        {
            tab1[i] = tab[i];

        }

        for(int i = 0; i< przyrosty.length; ++i)
        {
            int h = przyrosty[i];
            hSort(tab1,h);

        }
        return tab1;
    }

    private void hSort(Object[] tab, int h)
    {
        if(tab.length < h*2)
        {
            return;
        }
        for(int i = 0; i < h; ++i)
        {
            sortSubtab(tab,i,h);
        }

    }

    private void sortSubtab(Object[] tab, int poczatek, int hh)
    {
        for(int i = poczatek + hh; i<tab.length; i+=hh)
        {
            Object wartosc = tab[i];
            int j;
            for(j = i; j > poczatek; j-=hh)
            {
                Object poprzWartosc = tab[j-hh];
                if(porownaj(wartosc, poprzWartosc) >= 0)
                {
                    break;
                }
                zamien(tab, j-hh, j);
            }
        }
    }

}
