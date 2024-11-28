public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char carater='\u0040'; //@
        char decimal= 64;
        System.out.println("Caracter= "+ carater);
        System.out.println("Decimal = "+ decimal);
        System.out.println("decimal es igual a caracter?: "+(decimal==carater));

        char simbolo= '@';
        System.out.println("Simbolo"+ simbolo);
        System.out.println("Simbolo es igual a caracter?: "+(simbolo==carater));

        var espacio= ' ';//espacio \u0020

        char retroceso='\b';// elimina un espacio o letra

        char tabular='\t';// hace tabular

        char nuevaLinea='\n';//salto de linia

        char retornoCarro='\r';//

        System.out.println("tipo de char corresponde a \tbites a: " +retroceso+tabular+ Character.BYTES);
        System.out.println("tipo de char corresponde a bites a: " + Character.SIZE);
        System.out.println("valor máximo de un char: " + Character.MAX_VALUE);
        System.out.println("valor mínimo de un char: " + Character.MIN_VALUE);


    }
}
