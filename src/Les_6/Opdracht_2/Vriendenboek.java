package Les_6.Opdracht_2;

import java.util.ArrayList;

public class Vriendenboek {
    private String naam;
    private ArrayList<Vriend> vrienden;

    public Vriendenboek(String naam) {
        this.naam = naam;
        this.vrienden = new ArrayList<Vriend>();
        System.out.println("Account "+naam+" is aangemaakt");
    }

    public String getNaam() {
        return naam;
    }

    public void voegVriendToe(Vriend v) {
        if (!vrienden.contains(v)) {
            this.vrienden.add(v);
        }
    }

    public boolean verwijderVriend(Vriend v) {
        return vrienden.remove(v);
    }

    public boolean isVriend(Vriend v) {
        return this.vrienden.contains(v);
    }

    public int aantalVrienden() {
        return vrienden.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
