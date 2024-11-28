public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a= "a";
        String b= "b";
        String c= a;

        StringBuilder sb= new StringBuilder(a); // para concatenar grandes cantidades de String


        long tiempoInicial = System.currentTimeMillis();

        for (int i=0; i<500; i++) {
            //c= c.concat(a).concat(b).concat("\n");// tarda 2 milisegundos
            //c+=a+b+"\n"; // tarda 13 milisegundos
            sb.append(a).append(b).append("\n");// tarda 0 milisegundos

        }

        long tiempofinal = System.currentTimeMillis();

        //System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
        System.out.println(tiempofinal-tiempoInicial);



    }
}
