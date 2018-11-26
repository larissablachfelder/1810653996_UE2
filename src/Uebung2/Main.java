package Uebung2;

import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {

        //Hier werden zwei zahlen vom benutzer eingelesen
        int eingabe1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein!"));
        int eingabe2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein! Die Zahlen werden jetzt überprüft."));

        //die Zahlen werden überprüft
        if(eingabe1==eingabe2)//wenn die Zahlen gleich sind, werden diese ausgegeben
        {
           JOptionPane.showMessageDialog(null, "Die Zahlen stimmen überein. Zahl 1: "+eingabe1 + ", Zahl 2: " + eingabe2);

        }

        else //wenn die Zahlen nicht gleich sind
        {
            for(int i =0; ; i++)//schleife; der mittlere teil bleibt frei, da wir keine höchstgrenze wissen
            {


                if(eingabe1<eingabe2)//wenn zahl 1 kleiner ist, wird diese erhöht
                {
                    eingabe1++;
                    //JOptionPane.showMessageDialog(null, "Die Zahl1 wurde um 1 erhöht.");
                }

                else //wenn zahl 2 kleiner ist wird diese erhöht
                {
                    eingabe2++;
                    //JOptionPane.showMessageDialog(null, "Die Zahl2 wurde um 1 erhöht");
                }

                if(eingabe1==eingabe2)//wenn die Zahlen jetzt übereinstimmen wird die anzahl der durchgänge ausgegeben
                {
                    JOptionPane.showMessageDialog(null, "Die Zahlen stimmen jetzt nach " + i + ". Durchläufen überein.");
                    break;
                }


            }
        }

    }
}
