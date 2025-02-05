import javax.swing.*;

public class Montos {
    public static void main(String[] args) {

        // Varibles
        double monto = 0.0;
        double descuento = 0.0;
        double total = 0.0;

        // Entrada
        monto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el monto: "));

        // Proceso
        if (monto>=100) {
            descuento = monto * 0.90;
            total= monto-descuento;
        } else {
            descuento = monto * 0.05;
            total = monto-descuento;
        }
        // Salida
        JOptionPane.showMessageDialog(null, "El monto total a pagar " + total);
        }
    }
