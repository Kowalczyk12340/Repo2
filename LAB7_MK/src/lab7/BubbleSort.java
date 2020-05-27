package lab7;

public class BubbleSort extends AlgorytmSortowania
{
    public BubbleSort(Comparator komparator)
    {
        super(komparator);
    }

    public Object[] sort(Object[] tab, int ileElementow)
    {
        Object[] tabCopy = new Object[ileElementow];
        for (int i = 0; i < ileElementow; i++)
        {
            tabCopy[i] = tab[i];
        }

        for (int j = 0; j < ileElementow; j++)
        {
            for (int k = 0; k < ileElementow - (j + 1); k++)
            {
                if (porownaj(tabCopy, k, k + 1) > 0)
                {
                    zamien(tabCopy, k, k + 1);
                }
            }
        }
        return tabCopy;
    }
}
