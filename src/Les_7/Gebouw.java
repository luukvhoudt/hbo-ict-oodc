package Les_7;

public class Gebouw {
    private int lengte;
    private int breedte;
    private int aantalVerdiepingen;
    public int laatsteRenovatie;

    public Gebouw() {
        this(0,0,1);
    }
    public Gebouw(int lengte, int breedte, int aantalVerdiepingen) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.aantalVerdiepingen = aantalVerdiepingen;
    }

    public int oppervlakte() {
        return lengte * breedte;
    }

    public void renoveer(int jaarBuiten) {

    }

    public int berekenHuur() {
        return oppervlakte()*75;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
