import javax.swing.*;

public class NumeroMasAlto {
    public static void main(String[] args) {

        int max=0;

        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte número: ", "Insertar", JOptionPane.QUESTION_MESSAGE));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte segundo número: ", "Insertar", JOptionPane.QUESTION_MESSAGE));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte tercer número: ", "Insertar", JOptionPane.QUESTION_MESSAGE));

        max=(num1>num2) ? num1 : num2;
        max=(max>num3) ? max : num3;
        JOptionPane.showMessageDialog(null, "Numero 1:"+num1+"\nNumero 2:"+num2+"\nNumero 3:"+num3+"\nEl numero más alto es el: "+max);
    }
}
