package Les_7;

public class Huis extends Gebouw {
    public boolean isGeisoleerd;
    public int laatsteRenovatie;

    public Huis() {
        super();
    }

    public Huis(int lengte, int breedte, int aantalVerdiepingen) {
        super(lengte, breedte, aantalVerdiepingen);
    }

    public Huis(int lengte, int breedte, int aantalVerdiepingen, boolean isGeisoleerd) {
        super(lengte, breedte, aantalVerdiepingen);
        this.isGeisoleerd = isGeisoleerd;
    }

    public void renoveer(int buiten) {

    }

    public void renoveer(int jaarBuiten, int buiten) {
        renoveer(jaarBuiten);
    }

    @Override
    public int berekenHuur() {
        return oppervlakte()*100;
    }

    public void isoleer() {
        isGeisoleerd = true;
    }
}
