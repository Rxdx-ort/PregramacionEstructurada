import javax.swing.*;

public class CalculadoraRecargada {
    public static void main(String[] args) {
        // VARIABLES
        String menu = "";
        String opcion = "", resultado = "";
        double numero1 = 0.0, numero2 = 0.0;

        menu = "MENÚ PRINCIPAL\n" +
                "a) Sumar\n" +
                "b) Restar\n" +
                "c) Multiplicar\n" +
                "d) Dividir\n" +
                "e) Módulo\n" +
                "Elegir una opción:";

        opcion = JOptionPane.showInputDialog(menu);

        numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 1"));
        numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número 2"));

        opcion = opcion.toUpperCase();
        if (numero2>0.0) {
            switch (opcion) {
                case "a":
                case "A":
                    //Suma
                    resultado = "El resultado es: " + (numero1 + numero2);
                    break;
                case "b":
                case "B":
                    //Resta
                    resultado = "El resultado es: " + (numero1 - numero2);
                    break;
                case "c":
                case "C":
                    //Multiplicacion
                    resultado = "El resultado es: " +  (numero1 * numero2);
                    break;
                case "d":
                case "D":
                    //Division
                    resultado = "El resultado es: " + (numero1 / numero2);
                    break;
                case "e":
                case "E":
                    //Modulo
                    resultado = "El resultado es: " + (numero1 % numero2);
                    break;
                default:
                    resultado = "Caso no valido";

            }

            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "El numero 2 no puede ser 0 negativo");
        }
    }
}
