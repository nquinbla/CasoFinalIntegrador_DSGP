package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Mi Aplicación UAX");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); // Establece el color de fondo del marco principal

        // Configurar el diseño del marco principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));
        panelPrincipal.setBackground(Color.WHITE);
        add(panelPrincipal);

        // Título Principal "UAX"
        JLabel tituloPrincipal = new JLabel("UAX");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.PLAIN, 72));
        tituloPrincipal.setForeground(Color.BLUE);
        tituloPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra el título horizontalmente
        panelPrincipal.add(tituloPrincipal);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra el subtítulo horizontalmente
        panelPrincipal.add(subtitulo1);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo2.setForeground(Color.BLACK);
        subtitulo2.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra el subtítulo horizontalmente
        panelPrincipal.add(subtitulo2);

        // Logo de la Universidad UAX
        JLabel logoLabel = new JLabel(new ImageIcon("logoUAX.png"));
        logoLabel.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra el logo horizontalmente
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
