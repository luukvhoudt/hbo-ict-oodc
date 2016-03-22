package Practicum.Week4.Opdracht1;

import java.time.LocalDate;

public class Computer implements Goed {
    private String type;
    private String MacAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String type, String macAdres, double aanschafPrijs, int productieJaar) {
        this.type = type;
        MacAdres = macAdres;
        this.aanschafPrijs = aanschafPrijs;
        this.productieJaar = productieJaar;
    }

    public double huidigeWaarde() {
        double prijs = this.aanschafPrijs;
        for (int i = LocalDate.now().getYear(); i > this.productieJaar; i--) {
            prijs = prijs-((prijs/100)*40);
        }
        return (double)Math.round(prijs*100)/100;
    }

    @Override
    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Computer) {
            Computer c = (Computer) obj;

            if (this.MacAdres.equals(c.MacAdres)) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }

    @Override
    public String toString() {
        return "\nComputer: "+this.type+" heeft een waarde van: €"+this.huidigeWaarde();
    }
}
