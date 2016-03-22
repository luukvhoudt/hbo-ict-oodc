package Practicum.Week3.Opdracht2_3;

import java.time.LocalDate;

public class Game {
    private String naam;
    private int releaseJaar;
    private double nieuwprijs;

    public Game(String naam, int releaseJaar, double nieuwprijs) {
        this.naam = naam;
        this.releaseJaar = releaseJaar;
        this.nieuwprijs = nieuwprijs;
    }

    public String getNaam() {
        return naam;
    }

    public double huidigeWaarde() {
        double prijs = this.nieuwprijs;
        for (int i = LocalDate.now().getYear(); i > this.releaseJaar; i--) {
            prijs = prijs-((prijs/100)*30);
        }
        return (double)Math.round(prijs*100)/100;
    }

    @Override
    public boolean equals(Object andereObject) {
        boolean gelijkeObjecten = false;

        if (andereObject instanceof Game) {
            Game andereGame = (Game) andereObject;

            if (this.naam.equals(andereGame.naam)) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return "\n\t - "+this.naam+", uitgegeven in "+this.releaseJaar+"; nieuwprijs: €"+this.nieuwprijs+" nu voor: €"+this.huidigeWaarde();
    }
}
