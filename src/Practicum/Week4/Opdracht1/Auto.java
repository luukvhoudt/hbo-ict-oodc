package Practicum.Week4.Opdracht1;

import java.time.LocalDate;

public class Auto extends Voertuig {
    private String kenteken;

    public Auto(String type, double nieuwprijs,int bouwjaar, String kenteken) {
        super(type, nieuwprijs, bouwjaar);
        this.kenteken = kenteken;
    }

    public double huidigeWaarde() {
        double prijs = super.nieuwprijs;
        for (int i = LocalDate.now().getYear(); i > super.bouwjaar; i--) {
            prijs = prijs-((prijs/100)*30);
        }
        return (double)Math.round(prijs*100)/100;
    }

    @Override
    public boolean equals(Object obj) {
        boolean gelijkeObjecten = false;

        if (obj instanceof Auto) {
            Auto f = (Auto) obj;

            if (this.kenteken == f.kenteken) {
                gelijkeObjecten = true;
            }
        }

        return gelijkeObjecten;
    }
}
