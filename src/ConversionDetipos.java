import java.util.Arrays;

public class ConversionDetipos {
    public static void main(String[] args) {

        String numeroStr = "50";
        //convertir un string en entero
        int numeroInt= Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr= "20.98";
        //convertir un string en float o doble
        try {
            double realDouble= Double.parseDouble(realStr);
            System.out.println("realDouble = " + realDouble);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        String logicoStr = "true";
        //convertir un string en boolean
        boolean logicoBool= Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);


        int otronum=100;
        System.out.println("otronum = " + otronum);
        String otronumStr= Integer.toString(otronum);
        System.out.println("otronumStr = " + otronumStr);

        String otroNumStr2= String.valueOf(otronum+10);// ojo porque si ponemos un string no lo suma lo concatena
        System.out.println("otroNumStr2 = " + otroNumStr2);
        
        double otroReal=0.24;
        String otroRealDoubleStr= Double.toString(otroReal+1);
        System.out.println("otroRealDouble = " + otroRealDoubleStr);

        String otroRealDoubleStr2= String.valueOf(otroReal+2);
        System.out.println("otroRealDoubleStr2 = " + otroRealDoubleStr2);


        int i= 1000;
        short s= (short)i; //lo forzamos con un cast
        System.out.println("s = " + s);


    }
}
