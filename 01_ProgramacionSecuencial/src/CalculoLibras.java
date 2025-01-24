import javax.swing.*;

/*
*Escribir un programa que convierta tres numeros de
* Kilogramos a libras (1 libra = 0,454)
 */
public class CalculoLibras {
    public static void main(String[] args) {

        // Declaracion de constante
        final double FACTOR_CONVERSION = 0.454;

        // Declaracion de variables
        double numero1 = 0.0;
        double numero2 = 0.0;
        double numero3 = 0.0;

        // Solicitar los tres numero a calcular

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1: "));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2: "));
        numero3 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 3: "));
        String salida = "";

        salida = numero1 + " Kg" + " en libras es: " + String.format("%.3f", numero1 / FACTOR_CONVERSION) +
                "\n" + numero2 + " Kg" + " en libras es: " + String.format("%.3f", numero2 / FACTOR_CONVERSION) +
                "\n" + numero3 + " Kg" + " en libras es: " + String.format("%.3f", numero3 / FACTOR_CONVERSION);

        JOptionPane.showMessageDialog(null,salida);

    }
}
