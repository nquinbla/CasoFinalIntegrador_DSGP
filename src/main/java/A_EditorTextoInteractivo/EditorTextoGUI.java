package A_EditorTextoInteractivo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class EditorTextoGUI extends JFrame {
    private JTextArea textArea;
    private JFileChooser fileChooser;

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
    }

}
