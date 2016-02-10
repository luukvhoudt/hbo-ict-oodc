package Les_2.Opdracht_3;

public class Pilot {
    private String name;
    private double salary;
    private int hours;

    /**
     * Construct the attributes
     * @param constrName
     */
    public Pilot(String constrName) {
        name = constrName;
    }



    /**
     * Display all attributes with the following markup
     * @return
     */
    public String toString() {
        return name + " heeft " + hours + " vlieguren gemaakt en verdient " + salary;
    }

    /**
     * Get the total amount hours worked.
     * @return hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Get the latest salary set.
     * @return salary
     */
    public double getSalary() {
        return salary;
    }



    /**
     * Change the salary.
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Add hours worked to the current amount of hours worked.
     * @param hoursWorked
     */
    public void addHours(int hoursWorked) {
        this.hours += hoursWorked;
    }
}
