import javax.swing.*;

public class Ejercicio4MostrarNumOrdenados {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        a = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte Primer número: ", "Insertar", JOptionPane.QUESTION_MESSAGE));
        b = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte Primer número: ", "Insertar", JOptionPane.QUESTION_MESSAGE));

        /*if(a>b){
            JOptionPane.showMessageDialog(null, "1.--- "+a+"2.--- "+b);

        }else if(a<b){
            JOptionPane.showMessageDialog(null, "1.--- "+b+"\n2.--- "+a);
        }else{
            JOptionPane.showMessageDialog(null, "Ambos son iguales!");
        }*/


        // Operador ternario para determinar el número mayor, menor o si son iguales
        String mensaje = (a > b) ? "El número mayor es: " + a + "\nEl número menor es: " + b
                : (b > a) ? "El número mayor es: " + b + "\nEl número menor es: " + a
                : "Ambos números son iguales!";

        // Mostrar el mensaje usando JOptionPane
        JOptionPane.showMessageDialog(null, mensaje);
    }
}




