package Practicum.Week2.Opdracht1;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String Naam, int Leeftijd) {
        naam = Naam;
        leeftijd = Leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString() {
        return naam+"; leeftijd "+leeftijd+" jaar";
    }
}
