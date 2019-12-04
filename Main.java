package Calcu;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args){
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        JOptionPane.showMessageDialog(ventana, "Bienvenido, para realizar el exponencial, pulse primero sobre "
                + "'^' y después '='");
    }
}
