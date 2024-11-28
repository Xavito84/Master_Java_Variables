import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        // Arreglo de usuarios y contraseñas
        String[] username = new String[3];
        String[] password = new String[3];
        username[0] = "xavi";
        password[0] = "12345";

        username[1] = "admin";
        password[1] = "12345";

        username[2] = "miriam";
        password[2] = "12345";

        // Cuadro de diálogo para ingresar el usuario
        String u = JOptionPane.showInputDialog(null, "Ingrese su usuario", "Login", JOptionPane.QUESTION_MESSAGE);

        // Cuadro de diálogo para ingresar la contraseña
        String p = JOptionPane.showInputDialog(null, "Ingrese su contraseña", "Login", JOptionPane.QUESTION_MESSAGE);

        // Verificación del usuario y contraseña
        boolean validLogin = false;
        for (int i = 0; i < username.length; i++) {
            if (username[i].equals(u) && password[i].equals(p)) {
                validLogin = true;
                break;
            }
        }

        // Mensaje de validación
        if (validLogin) {
            JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso", "Login", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "Requiere autentificación", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
