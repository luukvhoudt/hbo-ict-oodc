package Practicum.Week4.Opdracht1;

import java.util.ArrayList;

public class BedrijfsInventaris {
    private String bedrijfsnaam;
    private double budget;
    private ArrayList<Goed> alleGoederen;

    public BedrijfsInventaris(String bedrijfsnaam, double budget) {
        this.bedrijfsnaam = bedrijfsnaam;
        this.budget = budget;
        this.alleGoederen = new ArrayList<Goed>();
    }

    public void schafAan(Goed g) {
        if (!this.alleGoederen.contains(g)
                && this.budget >= g.huidigeWaarde()) {
            this.budget-=g.huidigeWaarde();
            alleGoederen.add(g);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(bedrijfsnaam+" met inventaris:");

        for (Object obj: alleGoederen) {
            sb.append(obj);
        }
        return sb.toString();
    }
}
