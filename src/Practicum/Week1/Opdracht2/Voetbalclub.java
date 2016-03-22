package Practicum.Week1.Opdracht2;

public class Voetbalclub {
    private String naam;
    private int gewonnen;
    private int gelijk;
    private int verloren;
    private int punten;
    private int gespeeld;

    public Voetbalclub(String n) {
        naam = n;
    }

    public void verwerkResultaten(char r) {
        switch (r) {
            case 'w':
                gewonnen += 1;
                break;

            case 'g':
                gelijk += 1;
                break;

            case 'v' :
                verloren += 1;
                break;
        }
    }

    public int aantalGespeeld() {
        gespeeld = gewonnen+gelijk+verloren;
        return gespeeld;
    }

    public int aantalPunten() {
        punten = (gewonnen*3) + gelijk;
        return punten;
    }

    public String toString() {
        aantalGespeeld();
        aantalPunten();

        String s;
        s = "\r\n";
        s += "\033[1m"+naam+"\033[0m\n";
        s += "+----------+-----+\n";
        s += "| Gewonnen | "+gewonnen+"\t |\n";
        s += "| Gelijk   | "+gelijk+"\t |\n";
        s += "| Verloren | "+verloren+"\t |\n";
        s += "| Gespeeld | "+gespeeld+"\t |\n";
        s += "| Punten   | "+punten+"\t |\n";
        s += "+----------+-----+\r\n";
        return s;
    }
}
