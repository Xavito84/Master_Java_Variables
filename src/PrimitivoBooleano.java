public class PrimitivoBooleano {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);
        
        //se utilizan para los flujos de controles
        
        double d= 45128.43e-3; //45.12843
        System.out.println("d = " + d);
        float f= 1.2345e2f; // 123.45
        System.out.println("f = " + f);
        
        datoLogico = d>f;
        System.out.println("datoLogico = " + datoLogico);
        datoLogico = d<f;
        System.out.println("datoLogico = " + datoLogico);


        boolean esigual= (3-2)==1;
        System.out.println("esigual = " + esigual);
        

    }
}
