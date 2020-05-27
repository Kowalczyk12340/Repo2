package lab7;

public class KomparatorStypendiumStudenta implements Comparator
{
    public int compare(Object left, Object right) throws ClassCastException
    {
        return (int)(100f*(((Student)left).getKwotaStypendium()- ((Student)right).getKwotaStypendium()));
    }
}
