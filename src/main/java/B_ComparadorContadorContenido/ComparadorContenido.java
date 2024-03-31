package B_ComparadorContadorContenido;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComparadorContenido {
    public static boolean compararContenido(String archivo1, String archivo2) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(archivo1));
             BufferedReader reader2 = new BufferedReader(new FileReader(archivo2))) {
            String linea1;
            String linea2;
            while ((linea1 = reader1.readLine()) != null) {
                if ((linea2 = reader2.readLine()) == null || !linea1.equals(linea2)) {
                    return false;
                }
            }
            return reader2.readLine() == null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
