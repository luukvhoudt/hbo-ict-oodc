package Practicum.Les2.Opdracht1;

/**
 * Created by luuk on 2/10/16.
 */
public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;
    private double inhoud;

    public Zwembad() {
        lengte = 0;
        breedte = 0;
        diepte = 0;
    }
    public Zwembad(double l) {
        lengte = l;
        breedte = 0;
        diepte = 0;
    }
    public Zwembad(double l, double b) {
        lengte = l;
        breedte = b;
        diepte = 0;
    }
    public Zwembad(double l, double b, double h) {
        lengte = l;
        breedte = b;
        diepte = h;
        inhoud = lengte * breedte * diepte;
    }

    public double inhoud() {
        inhoud = lengte * breedte * diepte;
        return inhoud;
    }

    public double getLengte() {
        return lengte;
    }
    public void setLengte(double l) {
        lengte = l;
    }

    public double getBreedte() {
        return breedte;
    }
    public void setBreedte(double b) {
        breedte = b;
    }

    public double getDiepte() {
        return diepte;
    }
    public void setDiepte(double h) {
        diepte = h;
    }

    public String toString() {
        String s;
        s  = "Lengte: "+lengte+"\n";
        s += "Breedte: "+breedte+"\n";
        s += "Diepte: "+diepte+"\n";
        s += "Inhoud: "+inhoud;
        return s;
    }
}

