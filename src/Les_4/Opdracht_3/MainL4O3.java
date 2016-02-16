package Les_4.Opdracht_3;

import java.util.Scanner;
import java.util.ArrayList;

public class MainL4O3 {
    public static void main(String[] args) {
        // Scan the keyboard for inputs
        Scanner keyboard = new Scanner(System.in);

        // Note: It's not spanning a new line
        System.out.print("Type \"exit\" of \"quit\" om af te sluiten.\nVoer een getal in: ");

        // The array to store the doubles in
        ArrayList<Double> submitted = new ArrayList<Double>();

        // Boolean to check if the user is still typing
        boolean typing = true;

        // Keep asking for input
        while (typing) {

            // Ask again.
            System.out.print("Voer nog een getal in: ");

            // Wait for input and the start of a new line (enter)
            String input = keyboard.nextLine();

            // when the input is exit, stop
            if (input.equals("exit") || input.equals("quit")) {
                typing = false;

            } else {
                // Convert the input to a double
                double inputDouble = Double.parseDouble(input);

                submitted.add(inputDouble);
            }
        }

        // What is the average of the doubles submitted.
        double average = 0;

        for (int i=0; i<submitted.size(); i++) {
            average+=i;
        }
        average=average/submitted.size();

        // Print the average doubles submitted on a new line.
        System.out.println();

        // Stop scanning the keyboard for inputs
        keyboard.close();
    }
}
