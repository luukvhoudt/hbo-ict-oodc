package Practicum.Week4.Opdracht1;

public abstract class Voertuig implements Goed {
    private String type;
    protected double nieuwprijs;
    protected int bouwjaar;

    public Voertuig(String type, double nieuwprijs, int bouwjaar) {
        this.type = type;
        this.nieuwprijs = nieuwprijs;
        this.bouwjaar = bouwjaar;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "\nVoertuig: "+this.type+" met bouwjaar "+this.bouwjaar+" heeft een waarde van €"+huidigeWaarde();
    }
}
