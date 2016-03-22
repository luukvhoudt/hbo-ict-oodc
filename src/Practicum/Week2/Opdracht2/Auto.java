package Practicum.Week2.Opdracht2;

public class Auto {
    private String type;
    private double prijs;

    public Auto(String iType, double iPrijs) {
        type = iType;
        prijs = iPrijs;
    }

    public void setPrijs(double iPrijs) {
        prijs = iPrijs;
    }
    public double getPrijs() {
        return prijs;
    }

    public String toString() {
        String output = "";

        if (type==null || prijs==0) {
            output = "er is geen auto bekend";
        } else {
            output = type + " met prijs per dag: " + prijs;
        }
        return output;
    }
}
