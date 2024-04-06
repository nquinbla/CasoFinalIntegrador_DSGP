package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Sistema de Gestión de Publicaciones de la Universidad Alfonso X el Sabio (UAX)");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); // Establece el color de fondo del marco principal

        // Configurar el diseño del marco principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(null); // Usar un layout nulo
        panelPrincipal.setBackground(Color.WHITE);
        add(panelPrincipal);

        // Título Principal "UAX"
        JLabel tituloPrincipal = new JLabel("UAX");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.PLAIN, 142));
        tituloPrincipal.setForeground(Color.BLUE);
        tituloPrincipal.setBounds(500, 400, 500, 100); // Establecer la ubicación y el tamaño
        panelPrincipal.add(tituloPrincipal);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setBounds(470, 535, 500, 50); // Establecer la ubicación y el tamaño
        panelPrincipal.add(subtitulo1);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo2.setForeground(Color.BLACK);
        subtitulo2.setBounds(515, 570, 300, 50); // Establecer la ubicación y el tamaño
        panelPrincipal.add(subtitulo2);

        // Logo de la Universidad UAX
        JLabel logoLabel = new JLabel(new ImageIcon("logoUAX.png"));
        logoLabel.setBounds(50, 450, 200, 100); // Establecer la ubicación y el tamaño
        panelPrincipal.add(logoLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}
