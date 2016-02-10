package Les_1.Opdracht_2_3_4;

public class Client {

    private int age;
    private String name;
    private String country;

    public Client(int inputAge, String inputName, String inputCountry) {
        age = inputAge;
        name = inputName;
        country = inputCountry;
    }

    // Get functions
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }

    // Set functions
    public void setAge(int inputAge) { age = inputAge; }
    public void setName(String inputName) { name = inputName; }
    public void setCountry(String inputCountry) { country = inputCountry; }

    // Custom functions
    public String getText() {
        String text = "Age:\t\t" + age + "\nName:\t\t" + name + "\nCountry:\t" + country + "\n";
        return text;
    }
}
