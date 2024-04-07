package D_InterfazGráficaAvanzada;

import A_EditorTextoInteractivo.EditorTextoGUI;
import B_ComparadorContadorContenido.ComparadorContenidoGUI;
import C_BúsquedaYGestión.BuscadorPalabrasGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        panelPrincipal.setLayout(new GridBagLayout()); // Usar GridBagLayout
        panelPrincipal.setBackground(new Color(255, 255, 255, 200)); // Blanco semi-transparente
        panelPrincipal.setOpaque(false); // Hacer que panelPrincipal sea transparente
        add(panelPrincipal);

        // Título Principal "UAX"
        JLabel tituloPrincipal = new JLabel("<html><font color='grey'>U</font><font color='grey'>A</font><font color='blue'>X</font></html>");
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.BOLD, 142));
        GridBagConstraints gbcTitulo = new GridBagConstraints();
        gbcTitulo.gridx = 0;
        gbcTitulo.gridy = 0;
        gbcTitulo.weighty = 1;
        gbcTitulo.anchor = GridBagConstraints.PAGE_END;
        panelPrincipal.add(tituloPrincipal, gbcTitulo);

        // Subtítulos "Alfonso X el Sabio" y "Estructuras de datos"
        JLabel subtitulo1 = new JLabel("Universidad Alfonso X el Sabio");
        subtitulo1.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.ITALIC, 24));
        subtitulo1.setForeground(Color.BLACK);
        GridBagConstraints gbcSubtitulo1 = new GridBagConstraints();
        gbcSubtitulo1.gridx = 0;
        gbcSubtitulo1.gridy = 1;
        gbcSubtitulo1.weighty = 0;
        gbcSubtitulo1.anchor = GridBagConstraints.PAGE_START;
        panelPrincipal.add(subtitulo1, gbcSubtitulo1);

        JLabel subtitulo2 = new JLabel("Estructuras de datos");
        subtitulo2.setFont(new Font("Touch Me Sans Petite Semi Bold", Font.BOLD, 24));
        subtitulo2.setForeground(Color.BLUE);
        GridBagConstraints gbcSubtitulo2 = new GridBagConstraints();
        gbcSubtitulo2.gridx = 0;
        gbcSubtitulo2.gridy = 2;
        gbcSubtitulo2.weighty = 1;
        gbcSubtitulo2.anchor = GridBagConstraints.PAGE_START;
        panelPrincipal.add(subtitulo2, gbcSubtitulo2);

        // Panel para el logo
        JPanel panelLogo = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // Alinear a la derecha
        panelLogo.setOpaque(false); // Hacer que panelLogo sea transparente
        GridBagConstraints gbcLogo = new GridBagConstraints();
        gbcLogo.gridx = 0;
        gbcLogo.gridy = 3;
        gbcLogo.weighty = 1;
        gbcLogo.anchor = GridBagConstraints.PAGE_START;
        panelPrincipal.add(panelLogo, gbcLogo);

        // Logo de la Universidad UAX (más pequeño)
        ImageIcon logoIcon = new ImageIcon("C:\\Users\\nerea\\OneDrive\\Imágenes\\logoUAX-removebg-preview.png");
        Image img = logoIcon.getImage();
        Image newImg = img.getScaledInstance(logoIcon.getIconWidth() / 3, logoIcon.getIconHeight() / 3, Image.SCALE_SMOOTH);
        ImageIcon newLogoIcon = new ImageIcon(newImg);
        JLabel logoLabel = new JLabel(newLogoIcon);
        panelLogo.add(logoLabel);

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
}