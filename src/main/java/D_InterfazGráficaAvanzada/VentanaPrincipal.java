package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// clase VentanaPrincipal
public class VentanaPrincipal extends JFrame {

    private JDesktopPane desktopPane;

    // constructor
    public VentanaPrincipal() {
        setTitle("Interfaz Gráfica Avanzada");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo Documento");
        JMenuItem itemCerrar = new JMenuItem("Cerrar Todo");

        // evento para itemNuevo
        itemNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaDocumento();
            }
        });

        // evento para itemCerrar
        itemCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cerrarTodasVentanas();
            }
        });

        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemCerrar);
        menuBar.add(menuArchivo);
        setJMenuBar(menuBar);
    }

    // método crearVentanaDocumento
    private void crearVentanaDocumento() {
        VentanaDocumento ventanaDocumento = new VentanaDocumento();
        getContentPane().add(ventanaDocumento);
        ventanaDocumento.setVisible(true);
    }

    // método cerrarTodasVentanas
    private void cerrarTodasVentanas() {
        JInternalFrame[] ventanas = desktopPane.getAllFrames();
        for (JInternalFrame ventana : ventanas) {
            ventana.dispose();
        }
    }

    // método main
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}

