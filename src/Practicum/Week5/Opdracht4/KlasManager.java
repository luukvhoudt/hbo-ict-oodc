package Practicum.Week5.Opdracht4;

import java.io.*;

public class KlasManager {
    private String rootDir = "src/Practicum/Week5/Opdracht4/";

	public void klasOpslaan(Klas deKlas) throws IOException {
        FileOutputStream fos = new FileOutputStream(rootDir+"klas.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(deKlas);
        oos.close();
	}

	public Klas klasInladen() throws IOException, ClassNotFoundException {
		Klas deKlas = null;

        FileInputStream fis = new FileInputStream(rootDir+"klas.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        deKlas = (Klas) ois.readObject();
        ois.close();

		return deKlas;
	}
}
