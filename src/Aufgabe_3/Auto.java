package Aufgabe_3;



public class Auto extends Fahrzeug implements Comparable<Auto>
    /* Comparable muss impletiert werden um die Methode compareTo zu überschreiben
  mit <Auto> vergleicht man zwei Autos
*/

{
    private boolean klimaanlage;
    private short airbag;



    public void klimaanlageAn()
    {
        if(this.klimaanlage==true)
        {
            System.out.println("Klimaanlage ist bereits an.");
        }
        else
        {
            this.klimaanlage = true;
        }
    }

    public void klimaanlageAus()
    {
        if(this.klimaanlage==false)
        {
            System.out.println("Klimaanlage ist bereits aus.");
        }
        else
        {
            this.klimaanlage = false; //könnte auch getter und setter verwenden

        }
    }

    //aufgabe3

    public boolean getKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    //aufgabe 4

    public Auto( short airbag, short reifen, String color, short ps, short tueren, short geschwindigkeit) {
        super(reifen, color, ps, tueren, geschwindigkeit);
        this.klimaanlage = false;
        this.airbag = airbag;
    }

    //aufgabe 6 Methode überschreiben Übung

    @Override
    public String toString(){
        return "Mein Auto hat "+this.getPs()+" PS und fährt mit "+this.getGeschwindigkeit()+" km/h";
    }

//aufgabe 3 Leistungsbeurteilung
    @Override
    public int compareTo(Auto o)
    {
        if (this.getPs() == o.getPs())
        {
            return 0;
        }

        if (this.getPs() < o.getPs()){
            return 1;
        }
        return -1;
    }


        //Wenn das erste Auto mehr PS hat als das zweite Auto wird es in der liste drübergestellt deshalb return 1
        //ist es kleiner darunter deshalb -1
        //bei gleicher ps werden sie gleichgestellt deshalb return 0


}

