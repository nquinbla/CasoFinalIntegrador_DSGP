import A_EditorTextoInteractivo.*;
import B_ComparadorContadorContenido.*;
import C_BúsquedaYGestión.*;
import D_InterfazGráficaAvanzada.*;
import E_ValidaciónYDiseño.*;

import javax.swing.*;
import java.awt.*;

public class Pruebas2 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame frame = new MainFrame();
                frame.setVisible(true);
            }
        });
    }
}
