import javax.swing.*;

public class JoptionSistemasNumericos {
    public static void main(String[] args) {

        String numeroStr= JOptionPane.showInputDialog(null, "Ingrese un numero entero");
        int numeroDecimal=0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingrese un numero entero");
            main(args);
            System.exit(0);
        }




        String textoBinario="numero binario " + numeroDecimal+ "= "+ Integer.toBinaryString(numeroDecimal);


        String textoOctal="numero octal de " + numeroDecimal+ "= "+ Integer.toOctalString(numeroDecimal);


        String textoHexadecimal="numero hexadecimal de " + numeroDecimal+ "= "+ Integer.toHexString(numeroDecimal);



        String mensaje=textoBinario;

        mensaje+="\n"+textoOctal;
        mensaje+="\n"+textoHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
