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
        tituloPrincipal.setFont(new Font("Ardela Edge ARDELA EDGE X03 Extra Bold", Font.PLAIN, 142));
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
        subtitulo2.setForeground(Color.BLUE);
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

        // Agregar los menús a la barra de menú
        menuBar.add(menuA);
        menuBar.add(menuB);
        menuBar.add(menuC);
        menuBar.add(menuD);
        menuBar.add(menuE);

        menuA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear los menús para cada paquete
                JMenu menuA = new JMenu("Editor de Texto Interactivo");

                // Crear los elementos del menú para "Editor de Texto Interactivo"
                JMenuItem itemNuevo = new JMenuItem("Nuevo Documento");
                JMenuItem itemGuardar = new JMenuItem("Guardar Documento");
                JMenuItem itemAbrir = new JMenuItem("Abrir Documento");

                // Agregar ActionListener a los elementos del menú
                itemNuevo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para crear un nuevo documento
                        EditorTextoGUI editorTextoGUI = new EditorTextoGUI();
                        editorTextoGUI.setVisible(true);
                    }
                });

                itemGuardar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para guardar el documento actual
                        // Necesitarás una referencia al documento actual para hacer esto
                    }
                });

                itemAbrir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para abrir un documento existente
                        // Necesitarás una referencia al documento actual para hacer esto
                    }
                });

                // Agregar los elementos del menú a "Editor de Texto Interactivo"
                menuA.add(itemNuevo);
                menuA.add(itemGuardar);
                menuA.add(itemAbrir);            }
        });

        menuB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear los elementos del menú para "Comparador y Contador de Contenido"
                JMenuItem itemComparar = new JMenuItem("Comparar Contenido");
                JMenuItem itemContar = new JMenuItem("Contar Contenido");

                // Agregar ActionListener a los elementos del menú
                itemComparar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para comparar contenido
                        ComparadorContenidoGUI comparadorContenidoGUI = new ComparadorContenidoGUI();
                        comparadorContenidoGUI.setVisible(true);
                    }
                });

                itemContar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para contar contenido
                        // Necesitarás una referencia al contenido actual para hacer esto
                    }
                });

                // Agregar los elementos del menú a "Comparador y Contador de Contenido"
                menuB.add(itemComparar);
                menuB.add(itemContar);
            }
        });

        menuC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // Crear los elementos del menú para "Búsqueda y Gestión"
                JMenuItem itemBuscar = new JMenuItem("Buscar Palabras");
                JMenuItem itemGestionar = new JMenuItem("Gestionar Contactos");

            // Agregar ActionListener a los elementos del menú
                itemBuscar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para buscar palabras
                        BuscadorPalabrasGUI buscadorPalabrasGUI = new BuscadorPalabrasGUI();
                        buscadorPalabrasGUI.setVisible(true);
                    }
                });

                itemGestionar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para gestionar contactos
                        // Necesitarás una referencia a la agenda de contactos para hacer esto
                    }
                });

            // Agregar los elementos del menú a "Búsqueda y Gestión"
                menuC.add(itemBuscar);
                menuC.add(itemGestionar);            }
        });

        menuD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // Crear los elementos del menú para "Interfaz Gráfica Avanzada"
                JMenuItem itemSeguimientoRaton = new JMenuItem("Seguimiento del Ratón");
                JMenuItem itemBarraDesplazamiento = new JMenuItem("Barra de Desplazamiento Interactiva");
                JMenuItem itemHerramientaDibujo = new JMenuItem("Herramienta de Dibujo");

            // Agregar ActionListener a los elementos del menú
                itemSeguimientoRaton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la funcionalidad de seguimiento del ratón
                        SeguimientoRatón seguimientoRatón = new SeguimientoRatón();
                        seguimientoRatón.setVisible(true);
                    }
                });

                itemBarraDesplazamiento.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la funcionalidad de la barra de desplazamiento interactiva
                        BarraDesplazamientoInteractiva barraDesplazamientoInteractiva = new BarraDesplazamientoInteractiva();
                        barraDesplazamientoInteractiva.setVisible(true);
                    }
                });

                itemHerramientaDibujo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la funcionalidad de la herramienta de dibujo
                        HerramientaDibujo herramientaDibujo = new HerramientaDibujo();
                        herramientaDibujo.setVisible(true);
                    }
                });

            // Agregar los elementos del menú a "Interfaz Gráfica Avanzada"
                menuD.add(itemSeguimientoRaton);
                menuD.add(itemBarraDesplazamiento);
                menuD.add(itemHerramientaDibujo);            }
        });

        menuE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            // Crear los elementos del menú para "Validación y Diseño"
                JMenuItem itemValidarEmail = new JMenuItem("Validar Email");
                JMenuItem itemHerramientaDibujo = new JMenuItem("Herramienta de Dibujo");

            // Agregar ActionListener a los elementos del menú
                itemValidarEmail.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para validar email
                        ValidadorEmail validadorEmail = new ValidadorEmail();
                        validadorEmail.setVisible(true);
                    }
                });

                itemHerramientaDibujo.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la funcionalidad de la herramienta de dibujo
                        HerramientaDibujo herramientaDibujo = new HerramientaDibujo();
                        herramientaDibujo.setVisible(true);
                    }
                });

            // Agregar los elementos del menú a "Validación y Diseño"
                menuE.add(itemValidarEmail);
                menuE.add(itemHerramientaDibujo);            }
        });
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

