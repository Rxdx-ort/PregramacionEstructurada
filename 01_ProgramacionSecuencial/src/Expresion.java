import javax.swing.*;

/*
*Calcular el resultado de la expresion n = x+y/y-1
* para calcular los valores de x y y cualesquiera
 */
public class Expresion {
    public static void main(String[] args) {

        // declaracion de variables
        double x = 0.0;
        double y = 0.0;
        double n = 0.0;
        String salida = "";

        // Solicitar datos
        x = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor x: "));
        y = Double.parseDouble(JOptionPane.showInputDialog("Dame el valor de y: "));

        // Calcular expresion
        n = (x + y)/(y - 1);
        // Salida
        salida = "El resultado de la expresion es: " + String.format("%.2f", n);
        JOptionPane.showMessageDialog(null, salida);
    }
}
