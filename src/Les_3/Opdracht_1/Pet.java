package Les_3.Opdracht_1;

public class Pet {
    private String name;
    private String kind;
    private double weight;

    private Owner owner;

    public Pet(String constrName, String constrKind) {
        name = constrName;
        kind = constrKind;
    }

    public void setOwner(Owner constrOwner) {
        owner = constrOwner;
    }

    public Owner getOwner() {
        return owner;
    }

    public String toString() {
        if (owner == null) {
            return "Huisdier \""+name+"\" heeft nog geen baasje";
        } else {
            return "Baasje van \""+name+"\" is \""+owner+"\".";
        }
    }
}
