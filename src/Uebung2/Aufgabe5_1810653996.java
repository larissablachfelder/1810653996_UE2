package Uebung2;

import javax.swing.*;
import java.sql.SQLOutput;

public class Aufgabe5_1810653996
{
    //methoden werden hier nur aufgerufen
    public static void main(String[] args)
    {

        System.out.println("For-Schleife 1:");//22 wird als Variable a eingesetzt und dann wird die methode hier ausgeführt
        forschleife(22);
        System.out.println("\nFor-Schleife 2:");
        forschleife(6);

        System.out.println("\nWhile-Schleife 1:");
        whileschleife(8);
        System.out.println("\nWhile-Schleife 2:");
        whileschleife(67);

        System.out.println("\nNutzerschleife:");
        nutzerschleife();
    }

    //in dieser methode ist die for-schleife wird aber nicht ausgeführt
    static void forschleife(int a)
    {
       for(int i=1; i<=a; i++)
        {
            System.out.println("Die FOR-Schleife ist jetzt bei Durchlauf Nr. " + i);
        }
    }


    static void whileschleife(int a)
    {
        int b = 1; //zählervariable mit startwert setzen
        while(b<=a)
        {
            System.out.println("Die WHILE-Schleife ist jetzt beim " + b + ". Mal.");
            b++; //variable erhöhen
        }
    }


    static void nutzerschleife()
    {
        int schleife1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl für die äußere Schleife ein!"));
        int schleife2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl für die innere Schleife ein!"));

        int gesamtzahl = 0; //gesamtanzahl der inneren schleife da innere mal äußere

        for(int i = 1; i<=schleife1; i++)
        {
            for(int j = 1; j<=schleife2; j++)
            {
               gesamtzahl++;
                System.out.println("Das ist der " + gesamtzahl + ". Durchlauf der inneren Schleife.");
            }
        }



    }
}
