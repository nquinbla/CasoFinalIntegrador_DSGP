package B_ComparadorContadorContenido;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase ComparadorContenidoGUI
public class ComparadorContenidoGUI extends JFrame {

    private JTextArea areaArchivo1;
    private JTextArea areaArchivo2;

    // Constructor
    public ComparadorContenidoGUI() {
        setTitle("Comparador de Contenido");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        areaArchivo1 = new JTextArea();
        areaArchivo2 = new JTextArea();

        JScrollPane scrollPane1 = new JScrollPane(areaArchivo1);
        JScrollPane scrollPane2 = new JScrollPane(areaArchivo2);

        JPanel panelArchivos = new JPanel(new GridLayout(1, 2));
        panelArchivos.add(scrollPane1);
        panelArchivos.add(scrollPane2);

        JButton btnComparar = new JButton("Comparar");
        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compararArchivos();
            }
        });

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnComparar);

        setLayout(new BorderLayout());
        add(panelArchivos, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);
    }

    // Método para comparar archivos
    private void compararArchivos() {
        String textoArchivo1 = areaArchivo1.getText();
        String textoArchivo2 = areaArchivo2.getText();

        boolean sonIguales = ComparadorContenido.compararContenido(textoArchivo1, textoArchivo2);

        if (sonIguales) {
            JOptionPane.showMessageDialog(this, "Los archivos son iguales", "Comparación de Archivos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Los archivos son diferentes", "Comparación de Archivos", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ComparadorContenidoGUI().setVisible(true);
            }
        });
    }
}
