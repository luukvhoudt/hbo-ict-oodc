package Practicum.Les2.Opdracht2;

public class MainPL2O2 {
    public static void main(String[] args) {
        Voetbalclub ajax = new Voetbalclub("Ajax");
        System.out.println(ajax);
        Voetbalclub feij = new Voetbalclub("Feijenoord");
        feij.verwerkResultaten('w');
        feij.verwerkResultaten('w');
        feij.verwerkResultaten('w');
        feij.verwerkResultaten('g');
        System.out.println(feij);
    }
}
