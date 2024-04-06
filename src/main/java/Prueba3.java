

import A_EditorTextoInteractivo.EditorTextoGUI;
import B_ComparadorContadorContenido.ComparadorContenidoGUI;
import C_BúsquedaYGestión.BuscadorPalabrasGUI;
import E_ValidaciónYDiseño.ValidadorEmail;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba3 extends JFrame {

    public Prueba3() {
        setTitle("Sistema de Gestión de Publicaciones de la Universidad Alfonso X el Sabio (UAX)");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE); // Establece el color de fondo del marco principal

        // Configurar el diseño del marco principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout()); // Utiliza un BorderLayout para el panel principal
        panelPrincipal.setBackground(Color.WHITE);
        add(panelPrincipal);

        // Título Principal "UAX"
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>U</font><font color='grey'>A</font><font color='blue'>X</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        tituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el título
        panelPrincipal.add(tituloPrincipal, BorderLayout.CENTER);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el subtítulo
        panelPrincipal.add(subtitulo1, BorderLayout.SOUTH);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        subtitulo2.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el subtítulo
        panelPrincipal.add(subtitulo2, BorderLayout.NORTH);

        // Logo de la Universidad UAX
        ImageIcon logoIcon = new ImageIcon(getClass().getResource("/logoUAX.png"));
        JLabel logoLabel = new JLabel(logoIcon);
        panelPrincipal.add(logoLabel, BorderLayout.WEST);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear los menús para cada paquete
        JMenu menuEditorTexto = new JMenu("Editor de Texto Interactivo");
        JMenu menuComparadorContador = new JMenu("Comparador y Contador de Contenido");
        JMenu menuBusquedaGestion = new JMenu("Búsqueda y Gestión");
        JMenu menuInterfazGrafica = new JMenu("Interfaz Gráfica Avanzada");
        JMenu menuValidacionDiseno = new JMenu("Validación y Diseño");

        // Agregar los menús a la barra de menú
        menuBar.add(menuEditorTexto);
        menuBar.add(menuComparadorContador);
        menuBar.add(menuBusquedaGestion);
        menuBar.add(menuInterfazGrafica);
        menuBar.add(menuValidacionDiseno);

        // Agregar la barra de menú al marco principal
        setJMenuBar(menuBar);

        // Configurar la acción de los elementos del menú para cada módulo
        JMenuItem itemEditorTexto = new JMenuItem("Editor de Texto Interactivo");
        itemEditorTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EditorTextoGUI editorTextoGUI = new EditorTextoGUI();
                editorTextoGUI.setVisible(true);
            }
        });
        menuEditorTexto.add(itemEditorTexto);

        JMenuItem itemComparadorContador = new JMenuItem("Comparador y Contador de Contenido");
        itemComparadorContador.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ComparadorContenidoGUI comparadorContenidoGUI = new ComparadorContenidoGUI();
                comparadorContenidoGUI.setVisible(true);
            }
        });
        menuComparadorContador.add(itemComparadorContador);

        JMenuItem itemBusquedaGestion = new JMenuItem("Búsqueda y Gestión");
        itemBusquedaGestion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscadorPalabrasGUI buscadorPalabrasGUI = new BuscadorPalabrasGUI();
                buscadorPalabrasGUI.setVisible(true);
            }
        });
        menuBusquedaGestion.add(itemBusquedaGestion);

        JMenuItem itemInterfazGrafica = new JMenuItem("Interfaz Gráfica Avanzada");
        itemInterfazGrafica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir una nueva ventana para la Interfaz Gráfica Avanzada
            }
        });
        menuInterfazGrafica.add(itemInterfazGrafica
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Prueba3 frame = new Prueba3();
                frame.setVisible(true);
            } catch (Exception e) {
                // Manejo de excepciones
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al iniciar la aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

    }
}
