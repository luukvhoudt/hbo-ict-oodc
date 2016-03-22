package Practicum.Week2.Opdracht3;

public class Leerling {
    private String naam;
    private double cijfer;

    public Leerling(String iNaam) {
        naam = iNaam;
        cijfer = 0;
    }

    public String getNaam() {
        return naam;
    }

    public double getCijfer() {
        return cijfer;
    }
    public void setCijfer(double iCijfer) {
        cijfer = iCijfer;
    }
}
