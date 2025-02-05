import javax.swing.*;

public class ConversionesDistancias {
    public static void main(String[] args) {

        // Declaracion de variables
        double numPies= 0.0;
        double yarda= 0.0;
        double pulgada= 0.0;
        double centimetros= 0.0;
        double metros= 0.0;
        String salida = " ";

        // Entrada
        numPies = Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero de pies:"));

        // Proceso
        yarda = numPies/3;
        pulgada = numPies * 12.0;
        centimetros = pulgada * 2.54;
        metros = centimetros/100;

        // Salida
        salida = "Resultados\n" +
                "Las conversiones son: " + numPies + ", Pies son... " +
                "\nYardas: " + String.format("%.3f", yarda) +
                "\nPulgadas: " + String.format("%.3f", pulgada) +
                "\nCentimetros: " + String.format("%.3f", centimetros) +
                "\nMetros: " + String.format("%.3f", metros);

        JOptionPane.showMessageDialog(null, salida);

    }
}
