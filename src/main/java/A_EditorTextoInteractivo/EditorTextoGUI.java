package A_EditorTextoInteractivo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class EditorTextoGUI extends JFrame {
    private JTextArea textArea;
    private JFileChooser fileChooser;

    // Constructor
    public EditorTextoGUI() {
        setTitle("---- Editor de texto interactivo ----");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem menuItemGuardar = new JMenuItem("Guardar");
        JMenuItem menuItemAbrir = new JMenuItem("Abrir");

        // Eventos
        menuItemGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarArchivo();
            }
        });

        menuItemAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirArchivo();
            }
        });

        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(menuItemAbrir);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);

    }

    // Métodos
    private void guardarArchivo() {
        fileChooser = new JFileChooser();
        int seleccion = fileChooser.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                FileWriter fileWriter = new FileWriter(archivo);
                fileWriter.write(textArea.getText());
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void abrirArchivo() {
        fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = fileChooser.getSelectedFile();
            try {
                FileReader fileReader = new FileReader(archivo);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea;
                while ((linea = bufferedReader.readLine()) != null) {
                    textArea.append(linea + "\n");
                }
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Ejecución
    public static void main(String[] args) {
        EditorTextoGUI editor = new EditorTextoGUI();
        editor.setVisible(true);
    }

}
