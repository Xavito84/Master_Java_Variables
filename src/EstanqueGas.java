import javax.swing.*;

public class EstanqueGas {
    public static void main(String[] args) {

        double max= 70.0;

        double actual= 0.0;
        try {
            actual = Double.parseDouble(JOptionPane.showInputDialog(null, "Cuántos litros hay en el estanque: ", "Estanque", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0); // Salir del programa si la entrada no es válida
        }

        if(actual<0 || actual >max){
            JOptionPane.showMessageDialog(null, "El valor ingresado debe estar entre 0.0 y " + max + " litros.", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            if(actual==70.0){
                JOptionPane.showMessageDialog(null, "Estanque lleno");
            } else if (actual<70.0 && actual>=60.0) {
                JOptionPane.showMessageDialog(null,"Estanque casi lleno");
            } else if (actual<60.0 && actual>=40.0) {
                JOptionPane.showMessageDialog(null, "Estanque ha 3/4");
            } else if (actual<40.0 && actual>=35.0) {
                JOptionPane.showMessageDialog(null, "Medio Estanque ");
            } else if (actual<35.0 && actual>=20.0) {
                JOptionPane.showMessageDialog(null, "Suficiente");
            }else if (actual<20.0 && actual>=1.0){
                JOptionPane.showMessageDialog(null, "Insuficiente");
            }
        }

    }
}
