import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {

        // Solicitar los nombres completos (nombre y apellido)
        String persona1 = JOptionPane.showInputDialog(null, "Ingrese el nombre completo de la primera persona:", "Ingreso de Nombres", JOptionPane.QUESTION_MESSAGE);
        String persona2 = JOptionPane.showInputDialog(null, "Ingrese el nombre completo de la segunda persona:", "Ingreso de Nombres", JOptionPane.QUESTION_MESSAGE);
        String persona3 = JOptionPane.showInputDialog(null, "Ingrese el nombre completo de la tercera persona:", "Ingreso de Nombres", JOptionPane.QUESTION_MESSAGE);

        // Usar split para obtener solo el nombre (parte antes del primer espacio)
        String nombre1 = persona1.split(" ")[0];
        String nombre2 = persona2.split(" ")[0];
        String nombre3 = persona3.split(" ")[0];

        // Encontrar el nombre más largo sin usar loops
        String nombreMasLargo = (nombre1.length() > nombre2.length() && nombre1.length() > nombre3.length()) ? persona1
                : (nombre2.length() > nombre1.length() && nombre2.length() > nombre3.length()) ? persona2
                : persona3;

        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");
    }
}
