import java.util.Arrays;

public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso= "Programación Java";
        String profesor= "Lola Lucas";

        String detalle= curso+" con el profesor "+ profesor;
        System.out.println(detalle);

        int a= 10;
        int b=5;

        System.out.println(detalle+ (a+b)); // si pones los parentesis suma los enteros o los numeros si no los pones los concatena

        System.out.println(a+b+detalle);//  realiza la suma y luego concatena

        String detalle2= curso.concat(" con ").concat(profesor);
        System.out.println(detalle2);






    }
}
