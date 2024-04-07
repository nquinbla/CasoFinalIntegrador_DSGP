package C_BúsquedaYGestión;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase que representa la interfaz gráfica de un buscador de palabras
public class BuscadorPalabrasGUI extends JFrame {

    private JTextArea areaTexto;
    private JTextField campoBusqueda;

    // Constructor de la clase
    public BuscadorPalabrasGUI() {
        setTitle("Buscador de Palabras");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        campoBusqueda = new JTextField();
        campoBusqueda.setPreferredSize(new Dimension(500, 25)); // Ajusta el tamaño del campo de búsqueda
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

    // Método que busca una palabra en el texto y muestra un mensaje con el resultado
    private void buscarPalabra() {
        String texto = areaTexto.getText();
        String palabra = campoBusqueda.getText();
        int cantidad = BuscadorPalabras.buscarPalabra(texto, palabra);
        JOptionPane.showMessageDialog(this, "La palabra \"" + palabra + "\" aparece " + cantidad + " veces en el texto.", "Resultado de Búsqueda", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método principal que crea una instancia de la clase BuscadorPalabrasGUI y la muestra
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BuscadorPalabrasGUI().setVisible(true);
            }
        });
    }
}

