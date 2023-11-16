package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class pedal2 extends Thread {
    private int tiempo;
    private pedal2 pedal2;

    public pedal2(int milisegundos, JLabel jLabel) {
        this.tiempo = milisegundos;
        this.pedal2 = pedal2;
        this.pedal2.setEnabled(false);
    }

  

    private void mostrarImagen() {
        String ruta = "src\\Imagenes\\" + pedal2 + ".png";
        ImageIcon imageIcon = new ImageIcon(ruta);
        pedal2.setIcon(imageIcon);
        pedal2.setEnabled(true);
    }

    private void dormir() {
        try {
            Thread.sleep(this.tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(pedal2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setIcon(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}