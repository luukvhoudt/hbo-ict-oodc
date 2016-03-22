package Practicum.Week1.Opdracht2;

public class MainPW1O2 {
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
