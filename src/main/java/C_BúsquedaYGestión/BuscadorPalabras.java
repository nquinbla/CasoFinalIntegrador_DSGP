package C_BúsquedaYGestión;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Clase que busca una palabra en un texto y devuelve el número de veces que aparece
public class BuscadorPalabras {

    // Método que busca una palabra en un texto y devuelve el número de veces que aparece
    public static int buscarPalabra(String texto, String palabra) {
        Pattern pattern = Pattern.compile("\\b" + palabra + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(texto);
        int contador = 0;
        while (matcher.find()) {
            contador++;
        }
        return contador;
    }
}
