package lab7;

public class ComparatorsTest
{
    public static void main(String args[])
    {
        Student s[] = new Student[5];
        s[0] = new Student(112,"Kowalski", "Adam", 250f);
        s[1] = new Student(215,"Kowalski", "Tomasz", 200f);
        s[2] = new Student(118,"Adamiak", "Dorota", 0f);
        s[3] = new Student(324,"Zielinski", "Adam", 150f);
        s[4] = new Student(353,"Kowalski", "Jan", 350f);

        KomparatorNaturalnyStudenta kns = new KomparatorNaturalnyStudenta();
        System.out.println(kns.compare(s[0],s[1]));
        KomparatorZlozonyStudenta kzs1 = new KomparatorZlozonyStudenta();
        kzs1.dodaj(new KomparatorNazwiskoStudenta());
        kzs1.dodaj(new KomparatorImieStudenta());
        System.out.println(kzs1.compare(s[0],s[1]));
        System.out.println(kzs1.compare(s[0],s[2]));
        KomparatorZlozonyStudenta kzs2 = new KomparatorZlozonyStudenta();
        kzs2.dodaj(new KomparatorImieStudenta());
        kzs2.dodaj(new KomparatorNazwiskoStudenta());
        System.out.println(kzs1.compare(s[0],s[3]));
    }
}
