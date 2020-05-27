package lab7;

public class Student implements Comparable
{
    public int NrInd;
    public String nazwisko;
    public String imie;
    public double kwotaStypendium;
    public Student(int NrInd, String nazwisko, String imie, double kwotaStypendium)
    {
       this.imie = imie;
       this.nazwisko = nazwisko;
       this.kwotaStypendium = kwotaStypendium;
       this.NrInd = NrInd;
    }

    public int getNrInd()
    {
        return NrInd;
    }

    public void setNrInd(int nrInd)
    {
        NrInd = nrInd;
    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko)
    {
        this.nazwisko = nazwisko;
    }

    public String getImie()
    {
        return imie;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public double getKwotaStypendium()
    {
        return kwotaStypendium;
    }

    public void setKwotaStypendium(double kwotaStypendium)
    {
        this.kwotaStypendium = kwotaStypendium;
    }

    public int compareTo(Object drugi)
    {
        return this.getNrInd() - ((Student)drugi).getNrInd();
    }

    public boolean equals(Object drugi)
    {
        return this.getNrInd() == ((Student)drugi).getNrInd();
    }
    public String toString()
    {
        String temp = "";
        temp = NrInd+" "+nazwisko+" "+imie+" "+kwotaStypendium;
        return temp;
    }
}

