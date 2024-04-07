package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class DecoraciónPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Dibujar la primera línea inclinada de izquierda a derecha
        g2d.setColor(Color.BLUE);
        g2d.drawLine(width / 3, 0, 0, height);


        // Dibujar un triángulo entre las dos líneas
        int[] xPoints = {0, width / 3, width * 2 / 3}; // Coordenadas x de los puntos del triángulo
        int[] yPoints = {height, 0, 0}; // Coordenadas y de los puntos del triángulo
        int nPoints = 3; // Número de puntos del triángulo
        g2d.setColor(Color.BLUE);
        g2d.fillPolygon(xPoints, yPoints, nPoints); // Dibujar y rellenar el triángulo
    }
}
