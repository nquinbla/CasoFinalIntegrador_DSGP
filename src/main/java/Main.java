import A_EditorTextoInteractivo.*;
import B_ComparadorContadorContenido.*;
import C_BúsquedaYGestión.*;
import D_InterfazGráficaAvanzada.*;
import E_ValidaciónYDiseño.*;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                // Manejo de excepciones
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error al iniciar la aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}