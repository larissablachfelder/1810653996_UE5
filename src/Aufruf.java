import Aufgabe_1.Mensch;
import Aufgabe_2.Student;

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


    }

}
