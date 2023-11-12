package Clases;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class imagen1 extends Thread {
    private int tiempo;
    private boolean detener = false;
    private JLabel jLabel;

    public imagen1(int milisegundos, JLabel jLabel) {
        this.tiempo = milisegundos;
        this.jLabel = jLabel;
        this.jLabel.setEnabled(false);
    }

    public void detener() {
        this.detener = true;
    }

    @Override
    public void run() {
        while (!detener) {
            mostrarImagenAleatoria();
            dormir();
        }
    }

    private void mostrarImagenAleatoria() {
        int numero = (int) (Math.random() * 3) + 1;
        String ruta = "src\\Imagenes\\" + numero + ".png";
        ImageIcon imageIcon = new ImageIcon(ruta);
        jLabel.setIcon(imageIcon);
        jLabel.setEnabled(true);
    }

    private void dormir() {
        try {
            Thread.sleep(this.tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(imagen1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

