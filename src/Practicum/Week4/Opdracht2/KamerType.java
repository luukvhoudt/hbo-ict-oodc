package Practicum.Week4.Opdracht2;

public class KamerType {
    private String naam;
    private double prijs;

    public KamerType(double prijs, String naam) {
        this.prijs = prijs;
        this.naam = naam;
    }

    @Override
    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof KamerType) {
            KamerType kt = (KamerType) obj;

            if (this.naam.equals(kt.naam)) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return naam+", €"+prijs+" per nacht";
    }
}
