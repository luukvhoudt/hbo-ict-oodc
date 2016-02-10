package Les_3.Opdracht_1;

public class MainL3O1 {

    public static void main(String[] args) {
        Pet cat = new Pet("Bob", "Kat");
        Pet dog = new Pet("Simon", "Hond");

        Owner o = new Owner("Kees Jansen");

        cat.setOwner(o);
        dog.setOwner(o);

        System.out.println(cat);

        System.out.println(dog);

    }
}
