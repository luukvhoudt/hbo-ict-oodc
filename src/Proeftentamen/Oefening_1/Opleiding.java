package Proeftentamen.Oefening_1;

public class Opleiding {
    private String naam;
    private String variant;
    private int studieduur;
    private int minimumECs;

    public Opleiding(String naam, int studieduur, int minimumECs) {
        this.naam = naam;
        this.variant = "voltijd";
        this.studieduur = studieduur;
        this.minimumECs = minimumECs;
    }
    public Opleiding(String naam, String variant, int studieduur, int minimumECs) {
        this(naam, studieduur, minimumECs);
        this.variant = variant;
    }

    public String getNaam() {
        return naam;
    }

    public void setStudieduur(int studieduur) {
        this.studieduur = studieduur;
    }

    public void wijzigVariant(String variant) {
        if (variant == "voltijd" || variant == "deeltijd") {
            this.variant = variant;
        }
    }

    @Override
    public String toString() {
        return naam + " in " + variant + ". De studie duurt " + studieduur + " jaar (minimaal " + minimumECs + " EC)";
    }
}
