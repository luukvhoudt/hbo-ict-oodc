package Proeftentamen.Oefening_2;

public class Bus extends Voertuig {
    private int zitplaatsen;

    public Bus(String type, int maximumSnelheid, int zitplaatsen) {
        super(type, maximumSnelheid);
        this.zitplaatsen = zitplaatsen;
    }

    public void snelheidVerhogen() {

    }

    public void snelheidVerlagen() {

    }

    @Override
    public String toString() {
        return "Bus ("+zitplaatsen+" zitplaatsen) van type...";
    }
}
