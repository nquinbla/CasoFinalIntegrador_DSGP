package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;

public class DecoraciónPanel extends JPanel {
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        Color colorlínea = new Color(54, 121, 250, 98); // Blanco semi-transparente

        // Dibujar la primera línea inclinada de izquierda a derecha
        g2d.setColor(colorlínea);
        g2d.drawLine(width / 3, 0, 0, height);

        // Dibujar la segunda línea inclinada de izquierda a derecha equidistante de la primera
        int d = 225; // Distancia de la nueva línea a la primera
        g2d.drawLine(width / 3 + d, 0 + d, 0 + d, height + d);

        // Dibujar un triángulo entre las dos líneas
        int[] xPoints = {0, width / 3, width * 2 / 3}; // Coordenadas "x" de los puntos del triángulo
        int[] yPoints = {height, 0, 0}; // Coordenadas "y" de los puntos del triángulo
        int nPoints = 3; // Número de puntos del triángulo

        // Rellenar el triángulo con un color semi-transparente
        Color colortriángulos = new Color(54, 121, 250, 98); // Azul semi-transparente
        g2d.setColor(colortriángulos);
        g2d.fillPolygon(xPoints, yPoints, nPoints); // Dibujar y rellenar el triángulo


    }
}
