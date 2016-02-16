package Practicum.Les3.Opdracht2;

public class AutoHuur {
    private int aantaldagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public AutoHuur(){
        gehuurdeAuto = new Auto("", 0);
        huurder = new Klant("");
    }

    public void setAantalDagen(int iAantaldagen) {
        aantaldagen = iAantaldagen;
    }

    public void setGehuurdeAuto(Auto iGehuurdeAuto) {
        gehuurdeAuto = iGehuurdeAuto;
    }
    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant iHuurder) {
        huurder = iHuurder;
    }
    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs() {
        double prijs = gehuurdeAuto.getPrijs();
        double korting = huurder.getKorting();
        double totaal = aantaldagen*prijs;

        return totaal-(totaal*(korting/100));
    }

    public String toString() {
        String output = "";

        output += "\t"+this.getGehuurdeAuto();
        output += "\n\t"+this.getHuurder();
        output += "\n\taantal dagen: "+aantaldagen+" en dat kost "+this.totaalPrijs();

        return output;
    }
}
