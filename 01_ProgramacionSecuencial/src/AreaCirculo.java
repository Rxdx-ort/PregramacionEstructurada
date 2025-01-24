import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {

        //Declaracion de variables

        double radio = .0, area = 0.0;
        final double PI = 3.1416;
        String salida = "";

        radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio; "));
        area = PI + Math.pow(radio,2);
        salida = "El area del circulo es: " + radio + "es" + area;

        JOptionPane.showMessageDialog(null, salida);
    }
}
