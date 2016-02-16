package Practicum.Les3.Opdracht2;

public class Klant {
    private String naam;
    private double korting;

    public Klant(String iNaam) {
        naam = iNaam;
    }

    public void setKorting(double iKorting) {
        korting = iKorting;
    }
    public double getKorting() {
        return korting;
    }

    public String toString() {
        String output = "";

        if (naam==null || korting==0) {
            output = "er is geen huurder bekend";
        } else {
            output = naam+" (korting: "+korting+"%)";
        }
        return output;
    }
}