package Practicum.Week4.Opdracht1;

import java.time.LocalDate;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String type, double nieuwprijs, int bouwjaar, int framenummer) {
        super(type, nieuwprijs, bouwjaar);
        this.framenummer = framenummer;
    }

    public double huidigeWaarde() {
        double prijs = super.nieuwprijs;
        for (int i = LocalDate.now().getYear(); i > super.bouwjaar; i--) {
            prijs = prijs-((prijs/100)*10);
        }
        return (double)Math.round(prijs*100)/100;
    }

    @Override
    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Fiets) {
            Fiets f = (Fiets) obj;

            if (this.framenummer == f.framenummer) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }
}
