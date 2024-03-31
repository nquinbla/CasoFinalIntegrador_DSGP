package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() {
        setTitle("Interfaz Gráfica Avanzada");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JDesktopPane desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNuevo = new JMenuItem("Nuevo Documento");
        JMenuItem itemCerrar = new JMenuItem("Cerrar Todo");

        itemNuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearVentanaDocumento();
            }
        });

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

    private void crearVentanaDocumento() {
        VentanaDocumento ventanaDocumento = new VentanaDocumento();
        getContentPane().add(ventanaDocumento);
        ventanaDocumento.setVisible(true);
    }

    private void cerrarTodasVentanas() {
        JInternalFrame[] ventanas = this.getContentPane().getAllFrames();
        for (JInternalFrame ventana : ventanas) {
            ventana.dispose();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}

