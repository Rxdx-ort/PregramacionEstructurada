// Realizar un programa que permita determinar la calificacion de un alumno asignando una letra, si la calificacion es el
import javax.swing.*;
public class CalifABC {
    public static void main(String[] args) {
        double Calificacion = 0.0;
        String letra = "";
        Calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del Alumno"));

        if (Calificacion >= 0.0 && Calificacion <= 10.0) {
            if (Calificacion >= 9) {
                letra = "La letra del alumno es A";
            } else if (Calificacion >= 8) {
                letra = "La letra del alumno es B";
            } else if (Calificacion >= 7) {
                letra = "La letra del alumno es C";
            } else if (Calificacion >= 6) {
                letra = "La letra del alumno es D";
            } else if (Calificacion <= 5) {
                letra = "El alumno esta reprobado";
            }
            JOptionPane.showMessageDialog(null, letra);
        } else {
            JOptionPane.showMessageDialog(null, "Calificacion invalida");
        }
    }
}