package C_BúsquedaYGestión;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class AgendaContactosGUI extends JFrame {

    private JTextField campoNombre;
    private JTextField campoEmail;
    private JTextField campoTelefono;
    private JTextArea areaContactos;
    private AgendaContactos agenda;

    public AgendaContactosGUI() {
        setTitle("Agenda de Contactos");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        campoNombre = new JTextField(20);
        campoEmail = new JTextField(20);
        campoTelefono = new JTextField(20);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarContacto();
            }
        });

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarContacto();
            }
        });

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarContacto();
            }
        });

        areaContactos = new JTextArea();
        areaContactos.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaContactos);

        JPanel panelCampos = new JPanel();
        panelCampos.add(new JLabel("Nombre: "));
        panelCampos.add(campoNombre);
        panelCampos.add(new JLabel("Email: "));
        panelCampos.add(campoEmail);
        panelCampos.add(new JLabel("Teléfono: "));
        panelCampos.add(campoTelefono);

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAgregar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnBuscar);

        setLayout(new BorderLayout());
        add(panelCampos, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        agenda = new AgendaContactos();
    }

    private void agregarContacto() {
        String nombre = campoNombre.getText();
        String email = campoEmail.getText();
        String telefono = campoTelefono.getText();
        Contacto contacto = new Contacto(nombre, email, telefono);
        agenda.agregarContacto(contacto);
        actualizarAreaContactos();
    }

    private void eliminarContacto() {
        String email = campoEmail.getText();
        List<Contacto> contactos = agenda.buscarContactoPorEmail(email);
        if (!contactos.isEmpty()) {
            agenda.eliminarContacto(contactos.get(0));
            actualizarAreaContactos();
        }
    }

    private void buscarContacto() {
        String palabra = campoNombre.getText();
        List<Contacto> contactos = agenda.buscarContactos(palabra);
        areaContactos.setText("");
        for (Contacto contacto : contactos) {
            areaContactos.append(contacto.getNombre() + " - " + contacto.getEmail() + " - " + contacto.getTelefono() + "\n");
        }
    }

    private void actualizarAreaContactos() {
        areaContactos.setText(""); // Limpiar el área de texto
        for (Contacto contacto : agenda.getContactos()) { // Recorrer todos los contactos
            areaContactos.append(contacto.getNombre() + " - " + contacto.getEmail() + " - " + contacto.getTelefono() + "\n"); // Agregar cada contacto al área de texto
        }
    }
}