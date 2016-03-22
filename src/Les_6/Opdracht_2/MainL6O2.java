package Les_6.Opdracht_2;

import java.util.Scanner;

public class MainL6O2 {
    public static void main(String[] args) {
        // Account
        Vriendenboek vb = new Vriendenboek("Luuk");

        // Vrienden
        Vriend v1 = new Vriend("Piet", "Kierewiet", "p@k.com");
        Vriend v2 = new Vriend("Kees", "Vlees", "kees@hotmail.com");

        // Voeg een aantal vrienden toe
        vb.voegVriendToe(v1);
        vb.voegVriendToe(v2);

        // Verzamel de invoer
        Scanner input = new Scanner(System.in);

        System.out.println("\nZoek en indien mogelijk verwijder een vriend");

        System.out.print("Voornaam:\t ");
        String voornaam = input.nextLine();

        System.out.print("Achternaam:\t ");
        String achternaam = input.nextLine();

        System.out.print("Emailadres:\t ");
        String email = input.nextLine();

        // Check of de ingevoerde vriend een vriend is.
        Vriend inputVriend = new Vriend(voornaam, achternaam, email);

        if (vb.isVriend(inputVriend)) {
            System.out.println(voornaam + " " + achternaam + " is een vriend van " + vb.getNaam()+"!");
        } else {
            System.out.println(voornaam + " " + achternaam + " is geen vriend van " + vb.getNaam()+".");
        }

        // Verwijder de vriend
        if (vb.verwijderVriend(inputVriend)) {
            System.out.println("Het verwijderen van vriend "+voornaam+" "+achternaam+" is gelukt!");
        } else {
            System.out.println("De vriend "+voornaam+" "+achternaam+" kon niet verwijderd worden.");
        }

        System.out.println("\n"+vb);

    }
}
