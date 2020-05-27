package lab7;

public class Statystyka
{
    private long porownania;
    private long zamiany;

    public Statystyka()
    {
        this.porownania = 0;
        this.zamiany = 0;
    }
    public void porownanie()
    {
        porownania++;
    }
    public void zamiana()
    {
        zamiany++;
    }
    public long iloscPorownan()
    {
        return porownania;
    }
    public long iloscZamian()
    {
        return zamiany;
    }
    public void czysc()
    {
        porownania = 0;
        zamiany = 0;
    }
    public String toString()
    {
        return "Ilość Porownań = " + iloscPorownan() + ", oraz ilość zamian = " + iloscZamian();
    }
}

