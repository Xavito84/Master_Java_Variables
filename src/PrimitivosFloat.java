public class PrimitivosFloat {
    public static void main(String[] args) {

        float realFloat = 2.12e3f; // 2.12 elevado a 10*3= 2120.0
        float realFloat2= 0.00015f; // 1.5e-4f
        System.out.println("realFloat= "+ realFloat );
        System.out.println("realFloat2= "+ realFloat2 );

        System.out.println("float corresponde a byte a= "+ Float.BYTES);
        System.out.println("float corresponde a bites a= "+ Float.SIZE);
        System.out.println("maximo valor para float= "+ Float.MAX_VALUE);
        System.out.println("minimo valor para float= "+ Float.MIN_VALUE);


        System.out.println("*****************************************************************");


        double realDouble= 50.5;
        System.out.println("realDouble= "+ realDouble );

        System.out.println("double corresponde a byte a= "+ Double.BYTES);
        System.out.println("double corresponde a bites a= "+ Double.SIZE);
        System.out.println("maximo valor para double= "+ Double.MAX_VALUE);
        System.out.println("minimo valor para double= "+ Double.MIN_VALUE);

        System.out.println("*****************************************************************");
        var varFloatante= 3.145;
        System.out.println("varFloatante= "+ varFloatante );





    }
}
