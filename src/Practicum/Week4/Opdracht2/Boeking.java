package Practicum.Week4.Opdracht2;

import java.time.LocalDate;

public class Boeking {
    private LocalDate van;
    private LocalDate tot;
    private String naam;
    private String adres;
    private Kamer kamer;

    public Boeking(LocalDate van, LocalDate tot, String naam, String adres, Kamer kamer) {
        this.van = van;
        this.tot = tot;
        this.naam = naam;
        this.adres = adres;
        this.kamer = kamer;
    }

    @Override
    public String toString() {
        return "Boeking{" +
                "van=" + van +
                ", tot=" + tot +
                ", naam='" + naam + '\'' +
                ", adres='" + adres + '\'' +
                ", kamer=" + kamer +
                '}';
    }
}
