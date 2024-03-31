package A_EditorTextoInteractivo;

import java.nio.Buffer;

public class Documento {
    private String contenido;

    public Documento() {
        contenido = "";
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void guardarArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cargarArchivo(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            StringBuilder texto = new StringBuilder();
            while ((linea = reader.readLine()) != null) {
                texto.append(linea).append("\n");
            }
            contenido = texto.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int contarPalabras() {
        String[] palabras = contenido.split("\\s+");
        return palabras.length;
    }

    public String[] obtenerPalabrasComunes() {
        // Lógica para obtener palabras comunes
        return null;
    }
}

