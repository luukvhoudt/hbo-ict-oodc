package Practicum.Week2.Opdracht3;

public class MainPW2O3 {
    public static void main(String[] args) {
        Klas k = new Klas("V1Z");
        Leerling l = new Leerling("Hans");
        k.voegLeerlingToe(l);
        l = new Leerling("Jan");
        k.voegLeerlingToe(l);
        l = new Leerling("Wim");
        k.voegLeerlingToe(l);
        System.out.println(k);

        k.wijzigCijfer("Hans", 7.6);
        k.wijzigCijfer("Klaas", 7.6);
        System.out.println(k.toString());
        System.out.println("Aantal leerlingen: " + k.aantalLeerlingen());
    }
}
