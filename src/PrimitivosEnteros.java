public class PrimitivosEnteros {
    public static void main(String[] args) {

        //tamaño maximo es de 127 si ponemos 128 no lo soporta y como minimo -128
        byte numeroBytes = 7;
        System.out.println("numeroBytes: " + numeroBytes);
        System.out.println("tipo de byte corresponde a bites a: " + Byte.BYTES);
        System.out.println("tipo de byte corresponde a bites a: " + Byte.SIZE);
        System.out.println("valor máximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("valor mínimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 7;
        System.out.println("numeroShort: " + numeroShort);
        System.out.println("tipo de short corresponde a bites a: " + Short.BYTES);
        System.out.println("tipo de short corresponde a bites a: " + Short.SIZE);
        System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor mínimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 7;
        System.out.println("numeroInt: " + numeroInt);
        System.out.println("tipo de int corresponde a bites a: " + Integer.BYTES);
        System.out.println("tipo de int corresponde a bites a: " + Integer.SIZE);
        System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor mínimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 7;
        System.out.println("numeroLong: " + numeroLong);
        System.out.println("tipo de long corresponde a bites a: " + Long.BYTES);
        System.out.println("tipo de long corresponde a bites a: " + Long.SIZE);
        System.out.println("valor máximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor mínimo de un long: " + Long.MIN_VALUE);

        var numeroVar = 822337203685775807L;



    }
}
