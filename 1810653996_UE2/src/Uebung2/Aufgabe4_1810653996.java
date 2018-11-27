package Uebung2;

public class Aufgabe4_1810653996
{
    public static void main(String[] args)
    {   //for schleife alles im Kopf; kopfgesteuert
        for(int a=1; a<=10; a++)
        {
            System.out.println("Der FOR-Schleifenzähler ist: " + a);
        }

        //bedingung im kopf, raufzählen im körper
        int b = 1;
        while (b<=10)
        {

            System.out.println("Der WHILE-Schleifenzähler ist: " + b);
            b++;
        }

        //vorher ausgeführt, dann überprüft
        int c = 1;
        do
        {

            System.out.println("Der DO-WHILE-Schleifenzähler ist: " + c);
            c++;
        }
        while(c<=10);

    }

}
