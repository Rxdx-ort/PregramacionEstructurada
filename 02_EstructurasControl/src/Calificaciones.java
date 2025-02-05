import javax.swing.*;

public class Calificaciones {
    public static void main(String[] args) {

        // DECLARACION DE VARIABLESÇ
        double calif =0.0;
        String salida;

        // ENTRADA
        calif = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu calificacion: "));

        // PROCESO
        if (calif>=0.0 && calif<= 10.0);
        System.out.println("Aprobado");
        if (calif<=6.0);
        System.out.println("Reprobado");



    }
}
