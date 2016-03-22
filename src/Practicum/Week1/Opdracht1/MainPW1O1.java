package Practicum.Week1.Opdracht1;

public class MainPW1O1 {
    public static void main(String[] args) {
        Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
        System.out.println("\033[1mGegevens zwembad 1: \033[0m");
        System.out.println("Lengte: "+z1.getLengte());
        System.out.println("Breedte: "+z1.getBreedte());
        System.out.println("Diepte: "+z1.getDiepte());
        System.out.println("Inhoud: "+z1.inhoud());

        System.out.println();

        Zwembad z2 = new Zwembad();
        z2.setLengte(100.0);
        z2.setBreedte(2.5);
        z2.setDiepte(2.0);
        z2.inhoud();
        System.out.println("\033[1mGegevens zwembad 2: \033[0m\r\n"+z2);

    }
}
