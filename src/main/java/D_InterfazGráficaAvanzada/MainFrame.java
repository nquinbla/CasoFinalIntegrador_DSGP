package D_InterfazGráficaAvanzada;

import D_InterfazGráficaAvanzada.DecoraciónPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        // Personalización de colores para decorar :)
        Color colorMarcoPrincipal = new Color(110, 180, 250, 98); // Azul raro
        getContentPane().setBackground(colorMarcoPrincipal); // Establece el color de fondo del marco principal

        setTitle("Sistema de Gestión de Publicaciones de la Universidad Alfonso X el Sabio (UAX)");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Configurar el diseño del marco principal
        JPanel panelPrincipal = new DecoraciónPanel(); // Usar un panel personalizado
        BoxLayout boxLayout = new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS);
        panelPrincipal.setLayout(boxLayout); // Usar BoxLayout
        panelPrincipal.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panelPrincipal.setOpaque(false); // Hacer que panelPrincipal sea transparente
        add(panelPrincipal);

        // Título Principal "UAX"
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>U</font><font color='grey'>A</font><font color='blue'>X</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        tituloPrincipal.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el título
        panelPrincipal.add(Box.createVerticalGlue()); // Espacio entre el título y los subtítulos
        panelPrincipal.add(tituloPrincipal);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el subtítulo
        panelPrincipal.add(subtitulo1);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        subtitulo2.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar el subtítulo
        panelPrincipal.add(subtitulo2);
        panelPrincipal.add(Box.createVerticalGlue()); // Espacio entre los subtítulos y el logo

        // Logo de la Universidad UAX
        ImageIcon logoIcon = new ImageIcon("C:\\Users\\nerea\\OneDrive\\Imágenes\\logoUAX.png");
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setAlignmentX(Component.RIGHT_ALIGNMENT); // Alinear el logo a la derecha
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
