/*
Evaluar su un numero es mayor a 10, utilizando el operador ternario (?)
(expresion)? parte true : parte false
 */

import javax.swing.*;

public class NumeroMayor2 {
    public static void main(String[] args) {

        // DECLARACION DE VARIABLES
        double numero = 9;
        String salida = "";

        // ENTRADA
        numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce el número"));

        salida = (numero > 10) ? "El número es mayor a 10" : "El número es menor a 10";

        JOptionPane.showMessageDialog(null, salida);

        if (!(numero>10)) {
            salida = "El número es mayor a 10";

        }else{
            salida = "El numero es menor a 10";
    }

    }
}
