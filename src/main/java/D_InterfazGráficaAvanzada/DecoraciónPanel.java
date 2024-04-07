package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class DecoraciónPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Dibujar los rectángulos blancos en las partes superior e inferior
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height / 3);
        g2d.fillRect(0, 2 * height / 3, width, height / 3);

        // Dibujar los rectángulos azules en la parte media
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, height / 3, width, height / 3);

        // Dibujar las líneas inclinadas para delimitar los colores
        g2d.setColor(Color.BLACK);
        g2d.drawLine(0, 0, width, height);
        g2d.drawLine(width, 0, 0, height);
    }
}
