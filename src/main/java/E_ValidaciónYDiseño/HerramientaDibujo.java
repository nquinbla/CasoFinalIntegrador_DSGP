package E_ValidaciónYDiseño;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HerramientaDibujo extends JFrame{
    private int x, y;

    public HerramientaDibujo() {
        setTitle("Herramienta de Dibujo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Graphics g = panel.getGraphics();
                g.drawLine(x, y, e.getX(), e.getY());
            }
        });

        getContentPane().add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HerramientaDibujo().setVisible(true);
            }
        });
    }

}
