package lab7;

import java.util.*;

public class TestSortBubbleAndInsert
{
    public static void main(String args[])
    {
        Random r = new Random();
        String imie[] = {"Maciej","Jacek","Marcin","Józef","Franek"};
        String nazwisko[] = {"Kowalczyk","Maniecki","Lewandowski","Błaszczykowski"};
        Student tab[] = new Student[1000];

        for(int i = 0; i< 1000; i++)
        {
            tab[i] = (new Student(r.nextInt(1000)+1,nazwisko[r.nextInt(4)],imie[r.nextInt(3)],r.nextFloat()+200.0f));
        }

        //BUBBLE SORT
        BubbleSort sb = new BubbleSort(new KomparatorNaturalnyStudenta());
        Object tab1[] =  sb.sort(tab, 15);

        for(int i = 0; i<tab1.length; i++)
        {
            System.out.println(tab1[i]+"   ");
        }
        System.out.println();
        System.out.println("Babelkowe losowo: " + sb.statystyka);

        //INSERT SORT
        InsertSort sb1 = new InsertSort(new KomparatorNaturalnyStudenta());

        Object tab2[] =  sb1.sort(tab, 15);
        for(int i = 0; i<tab2.length; i++){
            System.out.println(tab2[i]+"   ");
        }
        System.out.println();
        System.out.println("Wstawianie losowo: " + sb1.statystyka);
    }
}

