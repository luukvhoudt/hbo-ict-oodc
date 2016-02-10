package Les_2.Opdracht_3;

/**
 *
 * @class Pilot
 *
 * - Constructer Les2: Pilot(String)
 *
 * - Attribuut Les2: String name
 * - Attribuut 2: double salary
 * - Attribuut 3: int hours
 *
 * - Methoden Les2: void setSalary(double newSalary)
 * - Methoden 2: void addHours(int hoursWorked)
 * - Methoden 3: int getHours()
 * - Methoden 4: double getSalary()
 * - Methoden 4: string toString()
 */


public class MainL2O3 {
    public static void main(String[] args) {
        Pilot p1 = new Pilot("John Travolta");
        p1.setSalary(123456.78);
        System.out.println("Zonder vlieguren: "+ p1.toString());
        p1.addHours(12);
        System.out.println("Eerste piloot: "+ p1 + "\n\r");

        Pilot p2 = new Pilot("Leonardo di Caprio");
        p2.setSalary(5000.00);
        p2.addHours(3);
        System.out.println("Vlieguren van tweede piloot: "+p2.getHours());
        System.out.println("Salaris van tweede piloot: "+p2.getSalary());
        System.out.println("Tweede piloot: "+p2);
    }
}
