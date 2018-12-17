package Aufgabe_1;

public class Mensch extends Saeugetier
{
    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }

    @Override //override, weil ich nun die abstrakte methode überschreibe
    public String printAll()
    {
        return String.format("%s#%d#%s", getName(), getAlter(), getGeschlecht());

        //%s ist platzhalter für String %d für integer
        //auch getName + "#" + getAlter()...
        //string format für platzhalter und kann zeichen in eine variable speichern


    }
}
