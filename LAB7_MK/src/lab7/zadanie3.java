package lab7;

import java.util.*;
public class zadanie3
{
    public static void main(String args[])
    {
        Random r = new Random();
        String imie[] = {"A","K","M","T","D"};
        String nazwisko[] = {"K","N","L","B"};
        Student tab[] = new Student[10];

        for(int i = 0; i< 10; i++)
        {
            tab[i] = (new Student(r.nextInt(1000)+1,nazwisko[r.nextInt(4)],imie[r.nextInt(3)],r.nextFloat()+200.0f));
        }

        System.out.println("Sortowanie wg nr Indeksu rosnaco");
        ShellSort test1 = new ShellSort (new KomparatorNaturalnyStudenta());
        Object [] shell1 = test1.sort(tab,10);

        for(int i=0;i<10;i++)
        {
            System.out.println(shell1[i]+"     ");
        }
        System.out.println();
        System.out.println(test1.statystyka);
        System.out.println(test1.testuj(shell1));
        System.out.println();

        //************************************
        System.out.println("Sortowanie wg stypendium malejaco");
        ShellSort test2 = new ShellSort
                (new KomparatorOdwrotnyStudenta(new KomparatorStypendiumStudenta()));
        Object [] shell2 = test2.sort(tab,10);

        for(int i=0;i<10;i++)
        {
            System.out.println(shell2[i]+"     ");
        }
        System.out.println();
        System.out.println(test2.statystyka);
        System.out.println(test2.testuj(shell2));

        System.out.println("*************************************************");

        System.out.println("Sortowanie wg nazwiska, a w przypadku tych samych imie malejaco");
        KomparatorZlozonyStudenta kzs = new KomparatorZlozonyStudenta();
        kzs.dodaj(new KomparatorNazwiskoStudenta());
        kzs.dodaj(new KomparatorOdwrotnyStudenta(new KomparatorImieStudenta()));
        ShellSort test3 = new ShellSort(kzs);

        Object [] shell3 = test3.sort(tab,10);

        for(int i=0;i<10;i++)
        {
            System.out.println(shell3[i]+"     ");
        }
        System.out.println();
        System.out.println(test3.statystyka);
        System.out.println(test3.testuj(shell3));
    }
}


