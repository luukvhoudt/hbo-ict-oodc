package Proeftentamen.Oefening_2;

public abstract class Voertuig {
    private String type;
    protected int maximumSnelheid;
    protected int huidigeSnelheid;

    public Voertuig(String type, int maximumSnelheid) {
        this.type = type;
        this.maximumSnelheid = maximumSnelheid;
    }

    public abstract void snelheidVerhogen();
    public abstract void snelheidVerlagen();

    @Override
    public String toString() {
        return super.toString();
    }
}
