import javax.swing.*;

public class SitemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println("numero binario = " + numeroDecimal+ "= "+ Integer.toBinaryString(numeroDecimal));

        int numeroBinario= 0b111110100; // poniendo antes el 0b java entiende que es un numero binario
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de = " + numeroDecimal+ "= "+ Integer.toOctalString(numeroDecimal));

        int numeroOctal=0764;// poniendo el 0 delante sabe que es un numero octal
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de = " + numeroDecimal+ "= "+ Integer.toHexString(numeroDecimal));

        int numeroHexadecimal= 0x1f4;// poniendo 0x sabe que es un numero hexadecimal
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);





    }
}
