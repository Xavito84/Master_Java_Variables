import java.sql.SQLOutput;
import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        String nombre1;
        String nombre2;
        String nombre3;
        String transformacion1="";
        String transformacion2="";
        String transformacion3="";

        Scanner sc= new Scanner(System.in);

        System.out.println("Escribe el primer nombre: ");
        nombre1=sc.nextLine();
        System.out.println("Escribe el segundo nombre: ");
        nombre2=sc.nextLine();
        System.out.println("Escribe el tercer nombre: ");
        nombre3=sc.nextLine();

        if(nombre1.length() >=3){
            char segundoCaracter1= Character.toUpperCase(nombre1.charAt(1));
            String dosUltimosCaracteres1= nombre1.substring(nombre1.length()-2);
            transformacion1= segundoCaracter1+"."+dosUltimosCaracteres1;

        }else{
            System.out.println("El nombre de la primera persona es demasiado corto mínimo 3 caracteres");
        }
        if(nombre2.length() >=3){
            char segundoCaracter2= Character.toUpperCase(nombre2.charAt(1));
            String dosUltimosCaracteres2= nombre2.substring(nombre2.length()-2);
            transformacion2= segundoCaracter2+"."+dosUltimosCaracteres2;

        }else{
            System.out.println("El nombre de la segunda persona es demasiado corto mínimo 3 caracteres");
        }

        if(nombre3.length() >=3){
            char segundoCaracter3= Character.toUpperCase(nombre3.charAt(1));
            String dosUltimosCaracteres3= nombre3.substring(nombre3.length()-2);
            transformacion3= segundoCaracter3+"."+dosUltimosCaracteres3;

        }else{
            System.out.println("El nombre de la primera persona es demasiado corto mínimo 3 caracteres");
        }

        System.out.println(transformacion1+"_"+transformacion2+"_"+transformacion3);


    }
}
