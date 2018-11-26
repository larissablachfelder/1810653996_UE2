package Uebung2;

import javax.swing.*;

public class Aufgabe3_1810653996
{
    public static void main(String[] args)
    {
        //double gibt bis zu 15 nachkommastellen zurück, hier nur 1, da diese 0 ist
        double alter;
        String eingabe = JOptionPane.showInputDialog("Bitte Alter eingeben.(double)");

        alter = Double.parseDouble(eingabe);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter);

        //Int gibt nur eine Ganzzahl zurück
        int alter2;
        String eingabe2 = JOptionPane.showInputDialog("Bitte Alter eingeben.(int)");

        alter2 = Integer.parseInt(eingabe2);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter2);

        //boolean gibt true oder false zurück, weshalb diese ausgabe ein false ausgibt da nichts überprüft wird und das dann false ist
        boolean alter3;
        String eingabe3 = JOptionPane.showInputDialog("Bitte Alter eingeben. (boolean)");

        alter3 = Boolean.parseBoolean(eingabe3);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter3);

        //long hat einen sehr großen wertebereich gibt aber nur eine Ganzzahl zurück
        long alter4;
        String eingabe4 = JOptionPane.showInputDialog("Bitte Alter eingeben. (long)");

        alter4 = Long.parseLong(eingabe4);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter4);

        //char kann nur einen wert speichern weshalb es bei einer einstelligen Zahl funktioniert,
        // bei einer zweistelligen zahl wird nur die erste ziffer ausgegeben
        char alter5;
        String eingabe5 = JOptionPane.showInputDialog("Bitte Alter eingeben.(char)");

        alter5 = eingabe5.charAt(0);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter5);

        //byte ganzzahl mit kleinem wertebereich -127 bis 127 gibt eine ganzzahl zurück
        byte alter6;
        String eingabe6 = JOptionPane.showInputDialog("Bitte Alter eingeben. (byte)");

        alter6 = Byte.parseByte(eingabe6);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter6);

        //short hat wertebereich von -32.768 - 32768 und gibt eine ganzzahl zurück
        short alter7;
        String eingabe7 = JOptionPane.showInputDialog("Bitte Alter eingeben. (short)");

        alter7 = Short.parseShort(eingabe7);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter7);

        //float zahl mit 7 nachkommastellen; man muss nach der zahl f hinschreiben; wird mit einer kommastelle angezeigt
        float alter8;
        String eingabe8 = JOptionPane.showInputDialog("Bitte Alter eingeben. (float)");

        alter8 = Short.parseShort(eingabe8);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter8);

        //in eine neue String speichern
        String alter9;
        String eingabe9 = JOptionPane.showInputDialog("Bitte Alter eingeben. (neue String)");

        alter9 = String.valueOf(eingabe9);

        JOptionPane.showMessageDialog(null, "Das eingegebene Alter ist: " + alter9);
    }
}
