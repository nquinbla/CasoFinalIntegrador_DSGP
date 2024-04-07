package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class DecoraciónPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Dibujar el rectángulo azul en la mitad izquierda
        g2d.setColor(Color.BLUE);
        g2d.fillRect(0, 0, width / 2, height);

        // Dibujar el rectángulo blanco en la mitad derecha
        g2d.setColor(Color.WHITE);
        g2d.fillRect(width / 2, 0, width / 2, height);

        // Dibujar la línea inclinada para delimitar los colores
        g2d.setColor(Color.BLACK);
        g2d.drawLine(width / 1, 0, 0, height); // Línea inclinada de izquierda a derecha
    }
}