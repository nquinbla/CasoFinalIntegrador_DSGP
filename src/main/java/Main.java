import A_EditorTextoInteractivo.*;
import B_ComparadorContadorContenido.*;
import C_BúsquedaYGestión.*;
import D_InterfazGráficaAvanzada.*;
import E_ValidaciónYDiseño.*;

public class Main {

    public static void main(String[] args) {
        // Ejecutar EditorTextoInteractivo
        EditorTextoGUI editorTextoGUI = new EditorTextoGUI();
        editorTextoGUI.setVisible(true);

        // Esperar a que el usuario interactúe con la GUI
        while (editorTextoGUI.isVisible()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Ejecutar ComparadorContenidoGUI
        ComparadorContenidoGUI comparadorContenidoGUI = new ComparadorContenidoGUI();
        comparadorContenidoGUI.setVisible(true);

        // Esperar a que el usuario interactúe con la GUI
        while (comparadorContenidoGUI.isVisible()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Ejecutar BuscadorPalabrasGUI
        BuscadorPalabrasGUI buscadorPalabrasGUI = new BuscadorPalabrasGUI();
        buscadorPalabrasGUI.setVisible(true);

        // Esperar a que el usuario interactúe con la GUI
        while (buscadorPalabrasGUI.isVisible()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Ejecutar VentanaPrincipal
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);

        // Esperar a que el usuario interactúe con la GUI
        while (ventanaPrincipal.isVisible()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Ejecutar ValidadorEmail
        ValidadorEmail validadorEmail = new ValidadorEmail();
        validadorEmail.setVisible(true);

        // Esperar a que el usuario interactúe con la GUI
        while (validadorEmail.isVisible()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}