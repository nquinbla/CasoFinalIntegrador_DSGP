package C_BúsquedaYGestión;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscadorPalabras {

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
