package Practicum.Week3.Opdracht2_3;

import java.util.ArrayList;

public class Persoon {
    private String naam;
    private double budget;
    private ArrayList<Game> mijnGames;

    public Persoon(String naam, double budget) {
        this.naam = naam;
        this.budget = budget;
        this.mijnGames = new ArrayList<Game>();
    }

    public boolean koop(Game g) {
        if (g.huidigeWaarde() <= this.budget    // De koper heeft genoeg geld
            && !this.mijnGames.contains(g)) {   // De koper heeft het spel nog niet
            this.budget-=g.huidigeWaarde();
            this.mijnGames.add(g);
            return true;
        } else {
            return false;
        }
    }

    public boolean verkoop(Game g, Persoon koper) {
        if (g.huidigeWaarde() <= koper.budget   // De koper heeft genoeg geld
            && !koper.mijnGames.contains(g)     // De koper heeft het spel nog niet
            && this.mijnGames.contains(g)) {    // De verkoper heeft het spel

            this.budget+=g.huidigeWaarde();
            this.mijnGames.remove(g);

            koper.budget-=g.huidigeWaarde();
            koper.mijnGames.add(g);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.naam+" heeft een budget van €"+this.budget+" en bevat de volgende games:");
        for (Game g: mijnGames) {
            sb.append(g);
        }
        return sb.toString();
    }

    /* Opdracht 3 */
    public Game zoekGameOpNaam(String naam) {
        Game result = null;
        for (Game g: mijnGames) {
            if (g.equals(new Game(naam, 0, 0))) {
                result = g;
            }
        }
        return result;
    }
}
