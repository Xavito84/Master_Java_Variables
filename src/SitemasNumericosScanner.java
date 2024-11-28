import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SitemasNumericosScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");



        int numeroDecimal=0;
        try{
            numeroDecimal= scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Error debe ingrese un numero entero");
            main(args);
            System.exit(0);
        }




        String textoBinario="numero binario " + numeroDecimal+ "= "+ Integer.toBinaryString(numeroDecimal);


        String textoOctal="numero octal de " + numeroDecimal+ "= "+ Integer.toOctalString(numeroDecimal);


        String textoHexadecimal="numero hexadecimal de " + numeroDecimal+ "= "+ Integer.toHexString(numeroDecimal);



        String mensaje=textoBinario;

        mensaje+="\n"+textoOctal;
        mensaje+="\n"+textoHexadecimal;
        System.out.println(mensaje);;





    }
}
