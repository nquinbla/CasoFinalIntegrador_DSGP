package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class DecoraciónPanel extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color colorlinea = new Color(54, 121, 250, 98); // Blanco semi-transparente

        // Dibujar la primera línea inclinada de izquierda a derecha
        g2d.setColor(colorlinea);
        g2d.drawLine(width / 3, 0, 0, height);

        // Dibujar un triángulo entre las dos líneas
        int[] xPoints = {0, width / 3, width * 2 / 3}; // Coordenadas x de los puntos del triángulo
        int[] yPoints = {height, 0, 0}; // Coordenadas y de los puntos del triángulo
        int nPoints = 3; // Número de puntos del triángulo

        // Rellenar el triángulo con un color semi-transparente
        Color colortriangulos = new Color(54, 121, 250, 98); // Azul semi-transparente
        g2d.setColor(colortriangulos);
        g2d.fillPolygon(xPoints, yPoints, nPoints); // Dibujar y rellenar el triángulo

        // Otra línea inclinada pero más pequeña
        int[] xPoints2 = {width * 2 / 3, width * 3 / 4, width}; // Coordenadas x de los puntos del segundo triángulo
        int[] yPoints2 = {0, height / 2, 0}; // Coordenadas y de los puntos del segundo triángulo
        g2d.fillPolygon(xPoints2, yPoints2, nPoints); // Dibujar y rellenar el segundo triángulo
    }
}
