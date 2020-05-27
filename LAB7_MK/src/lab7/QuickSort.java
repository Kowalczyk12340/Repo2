package lab7;

public class QuickSort extends AlgorytmSortowania
{
    public QuickSort(Comparator komparator)
    {
        super(komparator);
    }

    public Object[] sort(Object[] tab, int ileEl)
    {
        Object[] tab1 = new Object[ileEl];
        for(int i = 0; i<ileEl; i++)
        {
            tab1[i] = tab[i];
        }
        quicksort(tab1, 0,tab1.length-1);
        return tab1;
    }

    private void quicksort(Object[] tab, int poczatek, int koniec)
    {
        if(koniec>poczatek)
        {
            Object wartosc = tab[koniec];
            int podzial = podzial(tab,wartosc,poczatek,koniec-1);//podzial listy

            if(porownaj(tab[podzial],wartosc)<0)
            {
                ++podzial;
            }
            zamien(tab, podzial, koniec);
            quicksort(tab,poczatek,podzial-1);
            quicksort(tab,podzial+1,koniec);
        }


    }
    private int podzial(Object[] tab, Object wartosc, int lewyIndex, int prawyIndex)
    {
        int lewy = lewyIndex;
        int prawy = prawyIndex;
        while(lewy<prawy)
        {
            if(porownaj(tab[lewy],wartosc)<0)
            {
                ++lewy;
                continue;
            }
            if(porownaj(tab[prawy],wartosc)>=0)
            {
                --prawy;
                continue;
            }
            zamien(tab,lewy,prawy);
            ++lewy;
        }
        return lewy;
    }
}
