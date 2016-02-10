package Les_3.Opdracht_1;

public class Owner {
    private String name;
    private int OwnerID;

    // Constructors

    public Owner(String constrName) {
        name = constrName;
    }


    // The name of the owner

    public String getName() {
        return name;
    }


    // The ID of the owner

    public int getOwnerID() {
        return OwnerID;
    }

    public void setOwnerID(int constrOwnerID) {
        this.OwnerID = constrOwnerID;
    }



    public String toString() {
        return null;
    }
}
