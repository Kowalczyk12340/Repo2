package lab7;

public class InsertSort extends AlgorytmSortowania
{
    public InsertSort(Comparator komparator)
    {
        super(komparator);
    }

    public Object[] sort(Object[] tab, int ileEl)
    {
        Object[] tabCopy = new Object[ileEl];
        for(int i = 0; i < ileEl; i++)
        {
            tabCopy[i] = tab[i];
        }

        for(int j = 0; j< ileEl; j++)
        {
            int k = j;
            Object temp;
            temp = tabCopy[k];
            while(k>0){
                if(porownaj(tabCopy, k-1,k)>0)
                {
                    zamien(tabCopy,k-1,k);
                }
                k--;
            }
        }
        return tabCopy;
    }
}
