public class Variables {
    public static void main(String[] args) {
        String saludar = "Hola mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase()= " + saludar.toUpperCase());

        int numero = 10;
        System.out.println("numero= " + numero);

        boolean valor = true;
        int numero2 = 5;
        if (valor) {
            System.out.println("numero= " + numero);
            numero2 = 10;
        }
        System.out.println("numero2= " + numero2);

        var numero3 = "15";

        String nombre;


        nombre = "Lucas";

        if (numero > 10) {
            nombre = "Lola";
        }
        System.out.println("nombre= " + nombre);


        int edadPersona = 1;

        // para comentar linea
        /*
        comentar varias lineas
         */


    }
}
