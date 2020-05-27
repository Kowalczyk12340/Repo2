package lab7;

import java.util.*;

public class SortowanieORozN
{
    public static void main(String args[])
    {
        Random r = new Random();
        String imie[] = {"A","K","M","T","D"};
        String nazwisko[] = {"K","N","L","B"};
        Student tab[] = new Student[1000];
        for(int i = 0; i< 1000; i++)
        {
            tab[i] = (new Student(r.nextInt(1000)+1,nazwisko[r.nextInt(4)],
                    imie[r.nextInt(3)],r.nextFloat()+200.0f));
        }

        //Sortowanie rosnace wg. numeru Indeksu
        int tabOdN[] = {100,250,500,750,1000};


        System.out.println("**********************SORTOWANIE********************************");
        System.out.println("********************Sortowanie Babelkowe wg indeksu rosnaco (przypadek losowy)***************");
        System.out.println();

        for(int i=0; i<tabOdN.length; i++){

            BubbleSort sb1 = new BubbleSort(new KomparatorNaturalnyStudenta());
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb1[j]+"    ");

            }
            System.out.println();
            System.out.println("Babelkowe dla n="+tabOdN[i]+": " + sb1.statystyka);
            System.out.println();
            sb1.statystyka.czysc();

        }
        //********************************Sortowanie Babelkowe wg indeksu rosnaco (przypadek pesymistyczny)**************************************************
        System.out.println("*****************************Sortowanie Babelkowe wg indeksu rosnaco (przypadek pesymistyczny)************************");

        for(int i=0; i<tabOdN.length; i++){

            BubbleSort sb1 = new BubbleSort(new KomparatorOdwrotnyStudenta(new KomparatorNaturalnyStudenta()));
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            BubbleSort sb2 = new BubbleSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tabsb1,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb2[j]+"    ");

            }
            System.out.println();
            System.out.println("Babelkowe dla n="+tabOdN[i]+": " + sb2.statystyka);
            System.out.println();
            sb2.statystyka.czysc();
        }
        System.out.println("********************Sortowanie Babelkowe wg indeksu rosnaco (przypadek optymistyczny)*****************************");

        //********************************Sortowanie Babelkowe wg indeksu rosnaco (przypadek optymistyczny)**************************************************
        for(int i=0; i<tabOdN.length; i++){
            BubbleSort sb2 = new BubbleSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tab,tabOdN[i]);
            BubbleSort sb3 = new BubbleSort(new KomparatorNaturalnyStudenta());
            Object tabsb3[] = sb3.sort(tabsb2,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb3[j]+"    ");

            }
            System.out.println();
            System.out.println("Babelkowe dla n="+tabOdN[i]+": " + sb3.statystyka);
            System.out.println();
            sb3.statystyka.czysc();
        }
        //********************************Sortowanie przez Wstawianie wg indeksu rosnaco (przypadek losowy)**************************************************
        System.out.println("********************Sortowanie przez Wstawianie wg indeksu rosnaco (przypadek losowy)*****************************");

        for(int i=0; i<tabOdN.length; i++){

            InsertSort sb1 = new InsertSort(new KomparatorNaturalnyStudenta());
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb1[j]+"    ");

            }
            System.out.println();
            System.out.println("Sortowanie przez wstawianie dla n="+tabOdN[i]+": " + sb1.statystyka);
            System.out.println();
            sb1.statystyka.czysc();

        }
        //********************************Sortowanie przez Wstawianie wg indeksu rosnaco (przypadek pesymistyczny)**************************************************
        System.out.println("*****************************Sortowanie przez Wstawianie wg indeksu rosnaco (przypadek pesymistyczny)************************");

        for(int i=0; i<tabOdN.length; i++){

            InsertSort sb1 = new InsertSort(new KomparatorOdwrotnyStudenta(new KomparatorNaturalnyStudenta()));
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            InsertSort sb2 = new InsertSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tabsb1,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb2[j]+"    ");

            }
            System.out.println();
            System.out.println("Sortowanie przez wstawianie dla n="+tabOdN[i]+": " + sb2.statystyka);
            System.out.println();
            sb2.statystyka.czysc();

        }
        System.out.println("********************Sortowanie przez Wstawianie wg indeksu rosnaco (przypadek optymistyczny)*****************************");

        //********************************Sortowanie przez Wstawianie wg indeksu rosnaco (przypadek optymistyczny)**************************************************
        for(int i=0; i<tabOdN.length; i++){
            InsertSort sb2 = new InsertSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tab,tabOdN[i]);
            InsertSort sb3 = new InsertSort(new KomparatorNaturalnyStudenta());
            Object tabsb3[] = sb3.sort(tabsb2,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb3[j]+"    ");

            }
            System.out.println();
            System.out.println("Sortowanie przez wstawianie dla n="+tabOdN[i]+": " + sb3.statystyka);
            System.out.println();
            sb3.statystyka.czysc();
        }
        //********************************Sortowanie Shella wg indeksu rosnaco (przypadek losowy)**************************************************
        System.out.println("********************Sortowanie Shella wg indeksu rosnaco (przypadek losowy)*****************************");

        for(int i=0; i<tabOdN.length; i++){

            ShellSort sb1 = new ShellSort(new KomparatorNaturalnyStudenta());
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb1[j]+"    ");

            }
            System.out.println();
            System.out.println("Sortowanie Shella dla n="+tabOdN[i]+": " + sb1.statystyka);
            System.out.println();
            sb1.statystyka.czysc();

        }
        //********************************Sortowanie Shella wg indeksu rosnaco (przypadek pesymistyczny)**************************************************
        System.out.println("*****************************Sortowanie Shella wg indeksu rosnaco (przypadek pesymistyczny)************************");

        for(int i=0; i<tabOdN.length; i++){

            ShellSort sb1 = new ShellSort(new KomparatorOdwrotnyStudenta(new KomparatorNaturalnyStudenta()));
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            ShellSort sb2 = new ShellSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tabsb1,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb2[j]+"    ");

            }
            System.out.println();
            System.out.println("Sortowanie Shella dla n="+tabOdN[i]+": " + sb2.statystyka);
            System.out.println();
            sb2.statystyka.czysc();

        }
        System.out.println("********************Sortowanie Shella wg indeksu rosnaco (przypadek optymistyczny)*****************************");

        //********************************Sortowanie Shella wg indeksu rosnaco (przypadek optymistyczny)**************************************************
        for(int i=0; i<tabOdN.length; i++){
            ShellSort sb2 = new ShellSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tab,tabOdN[i]);
            ShellSort sb3 = new ShellSort(new KomparatorNaturalnyStudenta());
            Object tabsb3[] = sb3.sort(tabsb2,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb3[j]+"    ");

            }
            System.out.println();
            System.out.println("Sortowanie Shella dla n="+tabOdN[i]+": " + sb3.statystyka);
            System.out.println();
            sb3.statystyka.czysc();
        }
        //********************************QuickSort wg indeksu rosnaco (przypadek losowy)**************************************************
        System.out.println("********************QuickSort wg indeksu rosnaco (przypadek losowy)*****************************");

        for(int i=0; i<tabOdN.length; i++){

            QuickSort sb1 = new QuickSort(new KomparatorNaturalnyStudenta());
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb1[j]+"    ");

            }
            System.out.println();
            System.out.println("QuickSort dla n="+tabOdN[i]+": " + sb1.statystyka);
            System.out.println();
            sb1.statystyka.czysc();

        }
        //********************************QuickSort wg indeksu rosnaco (przypadek pesymistyczny)**************************************************
        System.out.println("*****************************QuickSort wg indeksu rosnaco (przypadek pesymistyczny)************************");

        for(int i=0; i<tabOdN.length; i++){

            QuickSort sb1 = new QuickSort(new KomparatorOdwrotnyStudenta(new KomparatorNaturalnyStudenta()));
            Object tabsb1[] = sb1.sort(tab, tabOdN[i]);
            QuickSort sb2 = new QuickSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tabsb1,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb2[j]+"    ");

            }
            System.out.println();
            System.out.println("QuickSort dla n="+tabOdN[i]+": " + sb2.statystyka);
            System.out.println();
            sb2.statystyka.czysc();

        }
        System.out.println("********************QuickSort wg indeksu rosnaco (przypadek optymistyczny)*****************************");

        //********************************QuickSort wg indeksu rosnaco (przypadek optymistyczny)**************************************************
        for(int i=0; i<tabOdN.length; i++){
            QuickSort sb2 = new QuickSort(new KomparatorNaturalnyStudenta());
            Object tabsb2[] = sb2.sort(tab,tabOdN[i]);
            QuickSort sb3 = new QuickSort(new KomparatorNaturalnyStudenta());
            Object tabsb3[] = sb3.sort(tabsb2,tabOdN[i]);
            for(int j = 0; j<tabOdN[i]; j++){
                System.out.print(tabsb3[j]+"    ");

            }
            System.out.println();
            System.out.println("QuickSort dla n="+tabOdN[i]+": " + sb3.statystyka);
            System.out.println();
            sb3.statystyka.czysc();
        }
    }
}
