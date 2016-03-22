package Practicum.Week5.Opdracht3;

import java.io.*;

public class UsdNaarEuro {
    public static void main(String[] args) {
        String rootDir = "src/Practicum/Week5/Opdracht3/";
        try {
            FileReader fr = new FileReader(rootDir+"prices_usd.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                double conv_euro = 0.918720;
                StringBuilder prices_euro = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    String[] parts = line.split(" : ");
                    double price_euro = Math.round((Double.parseDouble(parts[1])*conv_euro)*100);
                    prices_euro.append(parts[0]+" : "+price_euro/100+"\n");
                    line = br.readLine();
                }
                try {
                    File f = new File(rootDir+"prices_euro.txt");
                    if (!f.exists()) {
                        f.createNewFile();
                    }

                    FileWriter fw = new FileWriter(f.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);

                    bw.write(prices_euro.toString());
                    bw.close();

                } catch (IOException ioe) {
                    System.out.printf("On writeLine: %s", ioe);
                }
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
