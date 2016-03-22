package Practicum.Week4.Opdracht2;

public class Kamer {
    private int nummer;
    private KamerType kamertype;

    public Kamer(int nummer, KamerType kamertype) {
        this.nummer = nummer;
        this.kamertype = kamertype;
    }

    public int getNummer() {
        return nummer;
    }

    public KamerType getKamerType() {
        return kamertype;
    }

    @Override
    public String toString() {
        return "Kamer{" +
                "nummer=" + nummer +
                ", kamertype=" + kamertype +
                '}';
    }
}
