package D_InterfazGráficaAvanzada;

import javax.swing.*;
import java.awt.*;
// clase VentanaDocumento
public class VentanaDocumento extends JInternalFrame {

    public VentanaDocumento() {
        super("Documento", true, true, true, true);
        setSize(300, 200);

        JTextArea areaTexto = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}

