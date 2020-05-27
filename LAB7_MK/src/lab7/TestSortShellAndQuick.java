package lab7;

import java.util.*;

public class TestSortShellAndQuick
{
    public static void main(String args[])
    {
        Random r = new Random();
        String imie[] = {"A","K","M","T","D"};
        String nazwisko[] = {"K","N","L","B"};
        Student tab[] = new Student[1000];

        for(int i = 0; i< 1000; i++)
        {
            tab[i] = (new Student(r.nextInt(1000)+1,nazwisko[r.nextInt(4)],imie[r.nextInt(3)],r.nextFloat()+200.0f));

        }

        //SHELL SORT
        ShellSort test2 = new ShellSort(new KomparatorNaturalnyStudenta());
        Object shell2[] = test2.sort(tab,1000);
        for(int i=0;i<1000;i++)
        {
            System.out.print(shell2[i]+"     ");
        }
        System.out.println();
        System.out.println(test2.statystyka);
        ShellSort sh1 = new ShellSort(new KomparatorNaturalnyStudenta());
        Object tab1[] =  sh1.sort(tab, 15);
        for(int i = 0; i<tab1.length; i++)
        {
            System.out.print(tab1[i]+"        ");
        }
        System.out.println();
        System.out.println("Shella : " + sh1.statystyka);

        //QUICK SORT
        QuickSort q1 = new QuickSort(new KomparatorNaturalnyStudenta());
        Object tab2[] = q1.sort(tab, 20);
        System.out.println(q1.testuj(tab2));
        for(int i = 0; i<tab1.length; i++)
        {
            System.out.print(tab2[i]+"          ");
        }
        System.out.println();
        System.out.println("Quick : " + q1.statystyka);
    }
}
