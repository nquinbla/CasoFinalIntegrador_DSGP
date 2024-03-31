package B_ComparadorContadorContenido;

public class ContadorTexto {
    private String texto;
    public ContadorTexto() {
        texto = "";
    }

    public int contarPalabras() {
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }

    public int contarPalabrasEspeficas(String palabra) {
        String[] palabras = texto.split("\\s+");
        int contador = 0;
        for (String p : palabras) {
            if (p.equals(palabra)) {
                contador++;
            }
        }
        return contador;
    }

    public int contarLineas() {
        String[] lineas = texto.split("\n");
        return lineas.length;
    }


}
