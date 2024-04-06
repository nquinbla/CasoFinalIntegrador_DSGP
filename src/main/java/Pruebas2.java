import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pruebas2 extends JFrame {

    public Pruebas2() {
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
        JLabel tituloPrincipal = new JLabel("<html><font color='red'>U</font><font color='green'>A</font><font color='blue'>X</font></html>");        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.PLAIN, 142));
        tituloPrincipal.setForeground(Color.BLUE);
        tituloPrincipal.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el título
        panelPrincipal.add(tituloPrincipal, BorderLayout.CENTER);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el subtítulo
        panelPrincipal.add(subtitulo1, BorderLayout.SOUTH);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.PLAIN, 24));
        subtitulo2.setForeground(Color.BLACK);
        subtitulo2.setHorizontalAlignment(SwingConstants.CENTER); // Centra horizontalmente el subtítulo
        panelPrincipal.add(subtitulo2, BorderLayout.NORTH);

        // Logo de la Universidad UAX
        ImageIcon logoIcon = new ImageIcon("logoUAX.png"); // Ajusta la ruta del archivo de imagen
        JLabel logoLabel = new JLabel(logoIcon);
        panelPrincipal.add(logoLabel, BorderLayout.WEST);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crear los menús para cada módulo
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
        // Aquí debes agregar la lógica para cada módulo, como abrir ventanas o realizar acciones específicas

        // Ejemplo para el módulo Editor de Texto Interactivo
        JMenuItem itemNuevoDocumento = new JMenuItem("Nuevo Documento");
        menuEditorTexto.add(itemNuevoDocumento);
        itemNuevoDocumento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Lógica para abrir una nueva ventana de Editor de Texto Interactivo
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Pruebas2 frame = new Pruebas2();
                frame.setVisible(true);
            }
        });
    }
}
