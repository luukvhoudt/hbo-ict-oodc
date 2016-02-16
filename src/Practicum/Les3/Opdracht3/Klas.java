package Practicum.Les3.Opdracht3;

import java.util.ArrayList;

public class Klas {
    private String klasCode;
    private ArrayList<Leerling> leerlingen;

    public Klas(String iKlasCode) {
        klasCode = iKlasCode;
        leerlingen = new ArrayList<Leerling>();
    }

    public void voegLeerlingToe(Leerling iLeerling) {
        leerlingen.add(iLeerling);
    }

    public void wijzigCijfer(String naam, double cijfer) {
        for (Leerling l: leerlingen) {
            if (l.getNaam().equals(naam)) {
                l.setCijfer(cijfer);
            }
        }
    }

    public ArrayList<Leerling> getLeerlingen() {
        return leerlingen;
    }

    public int aantalLeerlingen(){
        return leerlingen.size();
    }

    public String toString() {
        String output = "";

        output += "In klas "+klasCode+" zitten de volgende leerlingen:\n";

        for(Leerling l: this.getLeerlingen()) {
            output += "- "+l.getNaam()+" heeft cijfer: "+l.getCijfer()+"\n";
        }

        return output;
    }
}
