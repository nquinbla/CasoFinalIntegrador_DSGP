import D_InterfazGráficaAvanzada.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                // Manejo de excepciones para errores inesperados :)
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al iniciar la aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}