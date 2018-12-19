package Aufgabe_2;

public class Student extends Mensch
{
    //neue attribute
    private int martrikelnummer;
    private String studgang;

    public Student(String vorname, String nachname, int alter, int martrikelnummer, String  studgang) {
        super(vorname, nachname, alter);
        this.martrikelnummer = martrikelnummer;
        this.studgang = studgang;
    }

    @Override
    public void status()
    {
        System.out.println("Es handelt sich um einen Studenten. Er/Sie  heißt " + getVorname() + " " + getNachname() + " und ist " + getAlter() + " Jahre alt. Die Martrikelnummer ist " + getMartrikelnummer() + ". Der Student studiert " + getStudgang() + ".");

    }

    //getter und setter

    public int getMartrikelnummer() {
        return martrikelnummer;
    }

    public void setMartrikelnummer(int martrikelnummer) {
        this.martrikelnummer = martrikelnummer;
    }

    public String getStudgang() {
        return studgang;
    }

    public void setStudgang(String studgang) {
        this.studgang = studgang;
    }
}
