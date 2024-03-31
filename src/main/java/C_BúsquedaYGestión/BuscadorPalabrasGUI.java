package C_BúsquedaYGestión;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuscadorPalabrasGUI extends JFrame {

    private JTextArea areaTexto;
    private JTextField campoBusqueda;

    public BuscadorPalabrasGUI() {
        setTitle("Buscador de Palabras");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        campoBusqueda = new JTextField();
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPalabra();
            }
        });

        JPanel panelBuscar = new JPanel();
        panelBuscar.add(new JLabel("Palabra a buscar: "));
        panelBuscar.add(campoBusqueda);
        panelBuscar.add(btnBuscar);

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(panelBuscar, BorderLayout.SOUTH);
    }

    private void buscarPalabra() {
        String texto = areaTexto.getText();
        String palabra = campoBusqueda.getText();
        int cantidad = BuscadorPalabras.buscarPalabra(texto, palabra);
        JOptionPane.showMessageDialog(this, "La palabra \"" + palabra + "\" aparece " + cantidad + " veces en el texto.", "Resultado de Búsqueda", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuscadorPalabrasGUI().setVisible(true);
            }
        });
    }
}

