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
        tituloPrincipal.setBounds(500, 400, 500, 125); // Establecer la ubicación y el tamaño
        panelPrincipal.add(tituloPrincipal);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setBounds(480, 535, 500, 50); // Establecer la ubicación y el tamaño
        panelPrincipal.add(subtitulo1);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo2.setForeground(Color.BLACK);
        subtitulo2.setBounds(520, 570, 300, 50); // Establecer la ubicación y el tamaño
        panelPrincipal.add(subtitulo2);

        // Logo de la Universidad UAX
        ImageIcon logoIcon = new ImageIcon("\"C:\\Users\\nerea\\OneDrive\\Imágenes\\logoUAX.png\""); // Reemplaza "ruta/del/logoUAX.png" con la ruta real de tu imagen
        JLabel logoLabel = new JLabel(logoIcon);
        logoLabel.setBounds(50, 450, logoIcon.getIconWidth(), logoIcon.getIconHeight()); // Establecer la ubicación y el tamaño
        panelPrincipal.add(logoLabel);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear los menús para cada paquete
        JMenu menuA = new JMenu("Editor de Texto Interactivo");
        JMenu menuB = new JMenu("Comparador y Contador de Contenido");
        JMenu menuC = new JMenu("Búsqueda y Gestión");
        JMenu menuD = new JMenu("Interfaz Gráfica Avanzada");
        JMenu menuE = new JMenu("Validación y Diseño");
        // Agregar más menús según sea necesario...

        // Agregar los menús a la barra de menú
        menuBar.add(menuA);
        menuBar.add(menuB);
        menuBar.add(menuC);
        menuBar.add(menuD);
        menuBar.add(menuE);

        // Establecer la barra de menú en el marco
        setJMenuBar(menuBar);
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

