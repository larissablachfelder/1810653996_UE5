import Aufgabe_1.Mensch;
import Aufgabe_2.Student;
import Aufgabe_3.Auto;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aufruf
{
    public static void main(String[] args)
    {
        System.out.println("\nAufgabe 1:");

        Mensch ich = new Mensch("Larissa", 19, "weiblich");

        System.out.println(ich.printAll());


        //Aufgabe 2
        System.out.println("\nAufgabe 2:");
        Aufgabe_2.Mensch larissa = new Aufgabe_2.Mensch("Larissa", "Blachfelder", 19);
        larissa.status();

        Student larissa2 = new Student("Larissa", "Blachfelder", 19, 1810653996, "Web Business & Technology");
        larissa2.status();

        //richtig
        Aufgabe_2.Mensch larissa3 = new Aufgabe_2.Mensch("Larissa", "Blachfelder", 19);
        larissa.status();

        larissa3 = new Student("Larissa", "Blachfelder", 19, 1810653996, "Web Business & Technology");
        larissa3.status();



        //Aufgabe 3
        System.out.println("\nAufgabe 3:");

        Auto bmw = new Auto ((short)4, (short)4, "blau", (short)220, (short)4, (short)200);
        Auto audi = new Auto ((short)6, (short)4, "weiß", (short)180, (short)3, (short)150);
        Auto renault = new Auto ((short)4, (short)4, "schwarz", (short)200, (short)5, (short)70);
        Auto suzuki = new Auto ((short)8, (short)4, "grau", (short)150, (short)4, (short)190);
        Auto audi2 = new Auto ((short)7, (short)4, "rot", (short)160, (short)5, (short)230);

        //liste mit autos
        List<Auto> liste = new ArrayList<>();
        liste.add(bmw);
        liste.add(audi);
        liste.add(renault);
        liste.add(suzuki);
        liste.add(audi2);
        Collections.sort(liste);//liste der autos sortieren nach PS absteigend

        for (Auto i : liste)
        {
            System.out.println(i);
        }

        //aufgabe 4
        System.out.println("\nAufgabe 4:");

        String eins = JOptionPane.showInputDialog("Gib irgendein Wort ein!");
        String zwei = JOptionPane.showInputDialog("Gib ein zweites Wort ein!");
        String drei = JOptionPane.showInputDialog("Gib noch ein Wort ein!");

        //String verleichen mit equal, == würde nur den Speicher überprüfen



        if(eins.equals(zwei))
        {
            System.out.println("Mindestens zwei der beiden sind gleich.");
        }

        else if(eins.equals(drei))
        {
            System.out.println("Mindestens zwei der beiden sind gleich.");
        }

        else if(zwei.equals(drei))
        {
            System.out.println("Mindestens zwei der beiden sind gleich.");
        }

        else
        {
            System.out.println("Keine der Wörter sind dieselben");
        }




    }

}
