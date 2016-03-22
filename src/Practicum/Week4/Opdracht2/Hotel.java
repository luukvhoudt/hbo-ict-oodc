package Practicum.Week4.Opdracht2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Hotel {
    private String naam;
    private ArrayList<Boeking> alleBoekingen;
    private ArrayList<Kamer> alleKamers;
    private ArrayList<KamerType> alleKamerTypen;

    public Hotel(String naam) {
        this.naam = naam;
        this.alleBoekingen = new ArrayList<Boeking>();
        this.alleKamers = new ArrayList<Kamer>();
        this.alleKamerTypen = new ArrayList<KamerType>();

        // Example data
        KamerType kt1 = new KamerType(12.40, "DeLuxe, bedden: 2");
        KamerType kt2 = new KamerType(23.10, "LePoor, bedden: 1.5");
        Kamer k1 = new Kamer(101, kt1);
        Kamer k2 = new Kamer(102, kt1);
        Kamer k3 = new Kamer(103, kt1);
        Kamer k4 = new Kamer(104, kt1);
        Kamer k5 = new Kamer(111, kt2);
        Kamer k6 = new Kamer(112, kt2);
        Kamer k7 = new Kamer(113, kt2);
        Kamer k8 = new Kamer(114, kt2);

        this.alleKamers.addAll(Arrays.asList(k1,k2,k3,k4,k5,k6,k7,k8));
        this.alleKamerTypen.addAll(Arrays.asList(kt1,kt2));
    }

    public int voegBoekingToe(LocalDate van, LocalDate tot, String naam, String adres, KamerType kamertype) {
        int kamerNummer = 0;
        for (Kamer kamer: alleKamers) {
            if (kamer.getKamerType().equals(kamertype)) {
                Boeking nieuweBoeking = new Boeking(van, tot, naam, adres, kamer);
                kamerNummer = kamer.getNummer();
            }
        }
        return kamerNummer;
    }

    public ArrayList<KamerType> getAlleKamerTypen() {
        return alleKamerTypen;
    }

    @Override
    public String toString() {
        return "Hotel: " +naam + " {" +
                "\nalleBoekingen=" + alleBoekingen +
                "\nalleKamers=" + alleKamers +
                "\nalleKamerTypen=" + alleKamerTypen +
                "\n}";
    }
}
