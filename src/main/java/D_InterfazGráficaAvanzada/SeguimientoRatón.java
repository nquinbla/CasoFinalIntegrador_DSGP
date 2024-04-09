package D_InterfazGráficaAvanzada;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// Clase que muestra la posición del ratón en una etiqueta
public class SeguimientoRatón extends JFrame {

    public SeguimientoRatón() {
        setTitle("Seguimiento del Ratón");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel etiquetaPosicion = new JLabel("Posición: (0, 0)");
        getContentPane().add(etiquetaPosicion);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                etiquetaPosicion.setText("Posición: (" + e.getX() + ", " + e.getY() + ")");
            }
        });
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SeguimientoRatón().setVisible(true);
            }
        });
    }
}
