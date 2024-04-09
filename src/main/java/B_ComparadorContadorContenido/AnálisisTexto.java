package B_ComparadorContadorContenido;

// Clase AnálisisTexto
public class AnálisisTexto {
    private String texto;
    public AnálisisTexto() {
        texto = "";
    }

    // Método para contar palabras
    public int contarPalabras() {
        String[] palabras = texto.split("\\s+");
        return palabras.length;
    }

    // Método para contar palabras específicas
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

    // Método para contar líneas
    public int contarLineas() {
        String[] lineas = texto.split("\n");
        return lineas.length;
    }


}
