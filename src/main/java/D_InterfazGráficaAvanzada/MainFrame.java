package D_InterfazGráficaAvanzada;

import A_EditorTextoInteractivo.EditorTextoGUI;
import B_ComparadorContadorContenido.ComparadorContenidoGUI;
import C_BúsquedaYGestión.BuscadorPalabrasGUI;
import E_ValidaciónYDiseño.HerramientaDibujo;
import E_ValidaciónYDiseño.ValidadorEmail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>U</font><font color='grey'>A</font><font color='blue'>X</font></html>");        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.PLAIN, 142));
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        tituloPrincipal.setBounds(500, 400, 500, 125); // Establecer la ubicación y el tamaño
        panelPrincipal.add(tituloPrincipal);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setBounds(480, 530, 500, 50); // Establecer la ubicación y el tamaño
        panelPrincipal.add(subtitulo1);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        subtitulo2.setBounds(525, 570, 300, 50); // Establecer la ubicación y el tamaño
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

        // Agregar los menús a la barra de menú
        menuBar.add(menuA); // Agregar el menú "Editor de Texto Interactivo"
        menuBar.add(menuB); // Agregar el menú "Comparador y Contador de Contenido"
        menuBar.add(menuC); // Agregar el menú "Búsqueda y Gestión"
        menuBar.add(menuD); // Agregar el menú "Interfaz Gráfica Avanzada"
        menuBar.add(menuE); // Agregar el menú "Validación y Diseño"

        // Agregar la barra de menú al marco principal
        setJMenuBar(menuBar);

        // Configurar la acción de los elementos del menú para cada paquete
        JMenuItem item1 = new JMenuItem("Editor de Texto Interactivo");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditorTextoGUI editorTextoGUI = new EditorTextoGUI();
                editorTextoGUI.setVisible(true);
            }
        });
        menuA.add(item1);

        JMenuItem item2 = new JMenuItem("Comparador y Contador de Contenido");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComparadorContenidoGUI comparadorContenidoGUI = new ComparadorContenidoGUI();
                comparadorContenidoGUI.setVisible(true);
            }
        });

        JMenuItem item3 = new JMenuItem("Búsqueda y Gestión");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscadorPalabrasGUI buscadorPalabrasGUI = new BuscadorPalabrasGUI();
                buscadorPalabrasGUI.setVisible(true);
            }
        });

        JMenuItem item4 = new JMenuItem("Interfaz Gráfica Avanzada");
        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });

        JMenuItem item5 = new JMenuItem("Validación y Diseño");
        item5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ValidadorEmail validadorEmail = new ValidadorEmail();
                validadorEmail.setVisible(true);
            }
        });

        // Agregar los elementos del menú al menú correspondiente
        menuA.add(item1);
        menuB.add(item2);
        menuC.add(item3);
        menuD.add(item4);
        menuE.add(item5);
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

