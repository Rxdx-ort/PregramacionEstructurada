import javax.swing.*;

public class EstructuraControlP1 {
    public static void main(String[] args) {

        //Variables
        String opcion = "";
        String menu = "a) Juego\n" +
                "b) Fruteria\n" +
                "c) Laboratorio\n" +
                "Elegir una opcion: ";


        opcion = JOptionPane.showInputDialog(menu);
        opcion = opcion.toUpperCase();

        switch (opcion){
            case "A":
                String pregunta = "¿Colón descubrio America?";
                String resp = JOptionPane.showInputDialog(pregunta + " Si/No");
                if(resp.equalsIgnoreCase("Si")) {
                    resp = JOptionPane.showInputDialog("La indeopendencia de México fue en 1810?");
                    if (resp.equalsIgnoreCase("Si")){
                }else{
                    JOptionPane.showMessageDialog
                            (null, "Respuesta incorrecta, has perdido");
                }else{
                        JOptionPane.showMessageDialog
                                (null, "Respuesta incorrecta, has perdido");
                    }
                    }
                break;
            case "B":
                break;
            case "C":
                break;
            case "D":
                JOptionPane.showMessageDialog(null,"El programa a terminado");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
}
