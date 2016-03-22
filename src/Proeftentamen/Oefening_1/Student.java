package Proeftentamen.Oefening_1;

public class Student {
    private String naam;
    private int leeftijd;
    private Opleiding opleiding;

    public Student(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }

    public Opleiding getOpleiding() {
        return opleiding;
    }

    public void setOpleiding(Opleiding opleiding) {
        this.opleiding = opleiding;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Student " + naam + " (" + leeftijd + " jaar) volgt ");

        if (opleiding == null) {
            sb.append("nog geen opleiding");
        } else {
            sb.append("de opleiding "+opleiding);
        }

        return sb.toString();
    }
}
