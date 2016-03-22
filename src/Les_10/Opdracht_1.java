package Les_10;

import java.io.*;
import java.net.URL;

public class Opdracht_1 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("src/Les_10/invoer.txt");
            BufferedReader br = new BufferedReader(fr);

            try {
                double total = 0;
                int iterations = 0;
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    iterations++;
                    total += Double.parseDouble(line);
                    sb.append(line+"\n");
                    line = br.readLine();
                }
                sb.append("Aantal getallen: "+iterations+"\n");
                sb.append("Gemiddelde: "+(total/iterations));
                System.out.println(sb.toString());
            } catch (IOException ioe) {
                System.out.printf("On readLine: %s", ioe);
            } finally {
                br.close();
            }
        } catch (IOException ioe) {
            System.out.printf("On initialization: %s", ioe);
        }
    }
}
