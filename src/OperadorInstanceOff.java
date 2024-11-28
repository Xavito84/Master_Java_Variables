public class OperadorInstanceOff {
    public static void main(String[] args) {

        String texto="Te quiero Miriam";

        Integer numero = 7;

        boolean b1= texto instanceof String;
        boolean b2= texto instanceof Object;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        b1 = numero instanceof Integer;
        b2 = numero instanceof Object;
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        b1 = numero instanceof Number;
        System.out.println("b1 = " + b1);




    }
}
