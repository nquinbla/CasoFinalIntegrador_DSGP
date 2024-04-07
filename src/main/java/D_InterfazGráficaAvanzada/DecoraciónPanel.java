package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class DecoraciónPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Dibujar las líneas inclinadas para delimitar los colores
        g2d.setColor(Color.BLUE);
        g2d.drawLine(width / 3, 0, 0, height); // Línea inclinada de izquierda a derecha
        g2d.drawLine(2 * width / 3, 0, width, height); // Línea inclinada de derecha a izquierda

        // Dibujar un triángulo inclinado entre las líneas
        int[] xPoints = {width / 3, 2 * width / 3, width / 2};
        int[] yPoints = {0, 0, height};
        g2d.fillPolygon(xPoints, yPoints, 3); // Triángulo inclinado entre las líneas
    }
}