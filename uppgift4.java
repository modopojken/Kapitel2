/*
En välkomnande kod
Gjord av Elias Conradsson
18/9 -17
*/

import javax.swing.*;
    
    public class Uppgift2.4 {
        public static void main(String[] args) {
 
            //Deklarerar använda strings
            String Num1;
            Num1 = "Hejsan Svejsan\n";
            String Num2;
            Num2 = "Welcome to ";
            String Num3;
            Num3 = "Borgafjall!";
            String Num4; 
            Num4 = "God damnit!";
            int i1;
            i1 = 5;
            
            //Skriver ut strings
            JOptionPane.showMessageDialog(null, Num3 + Num4);
            JOptionPane.showMessageDialog(null, Num1 + Num2 + i1);
            
            String InputName = JOptionPane.showInputDialog(null, "Jag heter Dankmannnnnn, vad heter du?");
            JOptionPane.showMessageDialog(null, "Hejsan " + InputName + "!" + " Drick blekningsmedel!");





//Detta är en enradskommentar
                        /*
                        Detta är en kommentar
                        som går över flera
                        rader
                        */ 

        }
    }