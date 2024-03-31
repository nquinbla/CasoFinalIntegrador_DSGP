package D_InterfazGráficaAvanzada;
import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class BarraDesplazamientoInteractiva extends JFrame {

    public BarraDesplazamientoInteractiva() {
        setTitle("Barra de Desplazamiento Interactiva");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JTextArea areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);

        JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                System.out.println("Posición: " + e.getValue());
            }
        });

        getContentPane().add(scrollPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BarraDesplazamientoInteractiva().setVisible(true);
            }
        });
    }
}
