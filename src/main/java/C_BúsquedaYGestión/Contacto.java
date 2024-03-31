package C_BúsquedaYGestión;

// Clase que representa un contacto con nombre, email y teléfono
public class Contacto {
    private String nombre;
    private String email;
    private String telefono;

    // Constructor de la clase
    public Contacto(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getNombre() {return nombre;}
    public String getEmail() {return email;}
    public String getTelefono() {return telefono;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setEmail(String email) {this.email = email;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
}
