import javax.swing.JOptionPane;

public class NumerosPares {
    public static void main(String[] args) {
        // Variables
        int numero = 0;
        String salida;

        // Entrada
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número:"));

        // Proceso
        if (numero % 2 == 0) {
            salida = "El número es par";
        } else {
            salida = "El número no es par";
        }

        // Salida
        JOptionPane.showMessageDialog(null, salida);
    }
}
