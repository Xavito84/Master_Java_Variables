import javax.swing.*;

public class LoginOperadorTernario {

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
            validLogin = (username[i].equals(u) && password[i].equals(p)) ? true : validLogin;

        }

        String mensaje = validLogin ? "Bienvenido usuario ".concat(u).concat("!\nDisfruta de tu sesión.") :
                "Usuario incorrecto!\nRequiere autenticación";

        JOptionPane.showMessageDialog(null, mensaje);


    }


}

