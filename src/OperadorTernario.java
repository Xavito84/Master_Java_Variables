import javax.swing.*;

public class OperadorTernario {
    public static void main(String[] args) {
        String variable = 7 ==7 ? "es verdadero" : "es falso";
        System.out.println("variable = " + variable);

        String estado="";
        double promedio= 0.0;

        double matematicas=0.0;
        double ciencias=0.0;
        double ingles= 0.0;

        matematicas = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota matematicas", "Notas", JOptionPane.QUESTION_MESSAGE));
        ciencias= Double.parseDouble(JOptionPane.showInputDialog(null, "Nota ciencias", "Notas", JOptionPane.QUESTION_MESSAGE));
        ingles= Double.parseDouble(JOptionPane.showInputDialog(null, "Nota ingles", "Notas", JOptionPane.QUESTION_MESSAGE));

        promedio =(matematicas+ciencias+ingles)/3;


        estado = promedio >= 5.0 ? "Aprobado" : "Suspendido";
        System.out.println("estado = " + estado);

        if(promedio >= 5.0){
            estado="Aprobado";
            System.out.println("estado = " + estado+ "promedio = " + promedio);
            JOptionPane.showMessageDialog(null, "estado = " + estado+ "y el promedio = " + promedio);
        }else {
            estado="Suspendido";
            System.out.println("estado = " + estado+"promedio = " + promedio);
            JOptionPane.showMessageDialog(null, "estado = " + estado+ " y el promedio = " + promedio);

        }
    }
}
