package Practicum.Les3.Opdracht1;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis(String iAdres, int iBouwjaar) {
        adres = iAdres;
        bouwjaar = iBouwjaar;
    }
    public void setHuisbaas(Persoon iHuisbaas) {
        huisbaas = iHuisbaas;
    }
    public Persoon getHuisbaas() {
        return huisbaas;
    }
    public String toString() {
        return "Huis "+adres+" is gebouwd in "+bouwjaar+"\nen heeft huisbaas "+huisbaas.getNaam()+"; leeftijd "+huisbaas.getLeeftijd()+" jaar";
    }
}
