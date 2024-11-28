public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Xavier";

        System.out.println("nombre.length() = "+ nombre.length());
        System.out.println("nombre.toUpperCase() = "+ nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = "+ nombre.toLowerCase());
        System.out.println("nombre.equals(\"Xavier\")= "+ nombre.equals("Xavier"));
        System.out.println("nombre.equals(\"xavier\")= "+ nombre.equals("xavier"));
        System.out.println("nombre.equalsIgnoreCase(\"xavier\") = " + nombre.equalsIgnoreCase("xavier"));;
        System.out.println("nombre.compareTo(\"Xavier\")= "+ nombre.compareTo("Xavier"));
        System.out.println("nombre.compareTo(\"Lucas\")= "+ nombre.compareTo("Lucas"));
        System.out.println("nombre.charAt((0))= "+ nombre.charAt((0)));
        System.out.println("nombre.charAt((1))= "+ nombre.charAt((1)));
        System.out.println("nombre.charAt((4))= "+ nombre.charAt((4)));
        System.out.println("nombre.charAt((nombre.length()-1))= "+ nombre.charAt((nombre.length()-1)));
        System.out.println("nombre.substring(1)= "+ nombre.substring(1) );
        System.out.println("nombre.substring(4)= "+ nombre.substring(4) );
        System.out.println("nombre.substring(1, 4)= "+ nombre.substring(1, 4) );
        System.out.println("nombre.substring(4, nombre.length())= "+ nombre.substring(4, nombre.length()) );

        String travalenguas= "travalenguas";
        System.out.println("travalenguas. replace= "+ travalenguas.replace("a","-"));
        System.out.println("travalenguas.indexOf= "+ travalenguas.indexOf('a'));
        System.out.println("travalenguas.lastInfexOf('a'))= "+ travalenguas.lastIndexOf('a'));

        System.out.println("travalenguas.contains(\"t\") = " + travalenguas.contains("t"));
        System.out.println("travalenguas.contains(\"z\") = " + travalenguas.contains("z"));

        System.out.println("travalenguas.startsWith(\"lenguas\") = " + travalenguas.startsWith("lenguas"));
        System.out.println("travalenguas.startsWith(\"tr\") = " + travalenguas.startsWith("tr"));
        System.out.println("travalenguas.endsWith(\"uas\") = " + travalenguas.endsWith("uas"));
        System.out.println("  travalenguas   " );
        System.out.println("  travalenguas   ".trim()); // para quitar espacios;












    }
}
