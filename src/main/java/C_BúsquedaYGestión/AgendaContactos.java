package C_BúsquedaYGestión;

import java.util.ArrayList;
import java.util.List;

// Clase que representa una agenda de contactos
public class AgendaContactos {
    private List<Contacto> contactos;
    public AgendaContactos() {contactos = new ArrayList<>();}
    public void agregarContacto(Contacto contacto) {contactos.add(contacto);}
    public void eliminarContacto(Contacto contacto) {contactos.remove(contacto);}

    // Método que busca un contacto por nombre
    public List<Contacto> buscarContactos(String palabra) {
        List<Contacto> contactosEncontrados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().toLowerCase().contains(palabra.toLowerCase()) ||
                    contacto.getEmail().toLowerCase().contains(palabra.toLowerCase()) ||
                    contacto.getTelefono().toLowerCase().contains(palabra.toLowerCase())) {
                contactosEncontrados.add(contacto);
            }
        }
        return contactosEncontrados;
    }

    // Método que busca un contacto por nombre
    public List<Contacto> buscarContactoPorEmail(String email) {
        List<Contacto> resultados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getEmail().equalsIgnoreCase(email)) {
                resultados.add(contacto);
            }
        }
        return resultados;
    }

    // Método que busca un contacto por nombre
    public List<Contacto> buscarContactoPorTelefono(String telefono) {
        List<Contacto> resultados = new ArrayList<>();
        for (Contacto contacto : contactos) {
            if (contacto.getTelefono().equalsIgnoreCase(telefono)) {
                resultados.add(contacto);
            }
        }
        return resultados;
    }
}

