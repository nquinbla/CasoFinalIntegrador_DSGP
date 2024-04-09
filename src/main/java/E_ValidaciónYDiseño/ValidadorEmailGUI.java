package E_ValidaciónYDiseño;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Clase que permite validar un email ingresado por el usuario
public class ValidadorEmailGUI extends JFrame {
    private JTextField campoEmail;

    // Constructor que inicializa la ventana y sus componentes
    public ValidadorEmailGUI() {
        setTitle("Validador de Email");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel etiqueta = new JLabel("Email:");
        campoEmail = new JTextField(20);
        JButton btnValidar = new JButton("Validar");

        btnValidar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarEmail(campoEmail.getText())) {
                    JOptionPane.showMessageDialog(panel, "El email es válido.", "Email Válido", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel, "El email no es válido.", "Email Inválido", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(etiqueta);
        panel.add(campoEmail);
        panel.add(btnValidar);
        add(panel);
    }

    private boolean validarEmail(String email) {
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Método principal que crea una instancia de la clase ValidadorEmailGUI y la muestra
    public static void main(String[] args) {
        ValidadorEmailGUI validador = new ValidadorEmailGUI();
        validador.setVisible(true);
    }
}