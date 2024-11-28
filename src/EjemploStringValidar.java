public class EjemploStringValidar {
    public static void main(String[] args) {

        String curso= null;

        boolean esNulo= curso ==null;



        if(esNulo== false){
            System.out.println(curso.toUpperCase());
        }
        if (esNulo == false){
            System.out.println("Bienvenido al curso "+ curso);
        }
        //cuando usamos concat no puede ser elString nulo lo usariamos asi:
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso="Programación Java";
        }

        boolean esVacio= curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2= curso.isEmpty();
        if(!esVacio){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }


        if(!esVacio2){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }

        boolean esBlanco= curso.isBlank(); //es la opción más segura desde la version 11.
        if(!esBlanco){
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenidos al curso ".concat(curso));
        }




    }
}
