import javax.swing.*;

public class SueldoEmpleado {

    public static void main(String[] args) {
        // Declaracion de variables
        String nombre = "";
        int hT = 0;
        double cuotasHoras = 0.0;
        double sueldo = 0.0;

        // Entrada de valores
        nombre = String.format(JOptionPane.showInputDialog("Introduce tu nombre: "));
        hT = Integer.parseInt(JOptionPane.showInputDialog("Introduce tus horas trabajadas: "));
        cuotasHoras = Double.parseDouble(JOptionPane.showInputDialog("Introduce la cuota por hora: "));

        // Calculo de sueldo
        JOptionPane.showMessageDialog(null, "El empleado " + nombre + " ");
    }
}
