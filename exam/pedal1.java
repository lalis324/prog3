package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class pedal1 extends Thread {
    private int tiempo;
    private pedal1 pedal1;

    public pedal1(int milisegundos, pedal1 pedal1) {
        this.tiempo = milisegundos;
        this.pedal1 = pedal1;
        this.pedal1.setEnabled(false);
       
    }


    private void mostrarImagen() {
        String ruta = "src\\imagenes\\" + pedal1 + ".png";
        ImageIcon imageIcon = new ImageIcon(ruta);
    
    }

    private void dormir() {
        try {
            Thread.sleep(this.tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(pedal1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
