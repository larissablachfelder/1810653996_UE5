import Aufgabe_1.Mensch;
import Aufgabe_2.Student;
import Aufgabe_3.Auto;

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
        larissa.Status();

        Student larissa2 = new Student("Larissa", "Blachfelder", 19, 1810653996, "Web Business & Technology");
        larissa2.Status();

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



    }

}
