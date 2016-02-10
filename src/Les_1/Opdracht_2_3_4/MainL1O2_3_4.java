package Les_1.Opdracht_2_3_4;

public class MainL1O2_3_4 {
    public static void main(String[] args) {
        Client k1 = new Client(22, "Kees", "Netherlands");
        System.out.println("Client information number 2:\n"+ k1.getText());

        Client k2 = new Client(12, "Truus", "Netherlands");
        k2.setAge(13);
        System.out.println("Client information number 2:\n"+ k2.getText());

    }
}
