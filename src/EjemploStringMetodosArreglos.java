public class EjemploStringMetodosArreglos {
    public static void main(String[] args) {

        String travalenguas = "travalenguas";

        System.out.println("travalenguas.toCharArray()= " +travalenguas.toCharArray());

        char[] arreglo= travalenguas.toCharArray();
        int largo= arreglo.length;
        System.out.println("largo = " + largo);

        for (int i=0; i< largo; i++) {
            System.out.println("arreglo = " + arreglo[i]);
        }

        System.out.println("travalenguas.split(\"a\") = " + travalenguas.split("a"));

        String[] arreglo2= travalenguas.split("a");

        int largo2= arreglo2.length;

        for (int j=0; j<largo2; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo="alguna.imagen.pdf";
        String[] archivoArreglo= archivo.split("\\."); //String[] archivoArreglo= archivo.split("[.]");
        largo2= archivoArreglo.length;

        for (int j=0; j<largo2; j++){
            System.out.println(archivoArreglo[j]);
        }

        System.out.println("extension = "+ archivoArreglo[largo2-1]);






    }
}
