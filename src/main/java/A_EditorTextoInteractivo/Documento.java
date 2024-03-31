package A_EditorTextoInteractivo;

import java.io.*;
import java.util.*;

// Clase Documento
public class Documento {
    private String contenido;

    // Constructor
    public Documento() {
        contenido = "";
    }
    // Getters y Setters
    public String getContenido() {return contenido;}
    public void setContenido(String contenido) {this.contenido = contenido;}

    // Método para guardar archivo
    public void guardarArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar archivo
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

    // Método para contar palabras
    public int contarPalabras() {
        String[] palabras = contenido.split("\\s+");
        return palabras.length;
    }

    // Método para obtener palabras comunes
    public String[] obtenerPalabrasComunes() {
        String[] palabras = contenido.split("\\s+");
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String palabra : palabras) {
            frequencyMap.put(palabra, frequencyMap.getOrDefault(palabra, 0) + 1);
        }


        List<Map.Entry<String, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        List<String> commonWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : list) {
            if (commonWords.size() < 10) {
                commonWords.add(entry.getKey());
            } else {
                break;
            }
        }

        return commonWords.toArray(new String[0]);
    }
}

