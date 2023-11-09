import java.util.logging.Level;
import java.util.logging.Logger;

public class HiloCarrera extends Thread {

    private final int cIndex = 0;

    public HiloCarrera(String name, int cIndex) {
        super(name);
        this.cIndex = cIndex;
    }

    public void run() {
       Datos caballo = Carreras.carros[cIndex];

        long ti = System.currentTimeMillis();

        for (int j = 0; j < 99; j++) {
            try {
                int avance = caballo.getAvance();
                frmInicio.carros[cIndex].setLocation(frmInicio.carros[cIndex].getLocation().x + avance, frmInicio.carros[cIndex].getLocation().y);

                sleep(ca.getVelocidad());

                if (frmInicio.carros[cIndex].getLocation().x >= frmInicio.meta.getLocation().x) {
                    long tf = System.currentTimeMillis();
                    long tt = tf - ti;
                    caballo.setTiempo(tt);
                    frmInicio.tabla.append("\n" + this.getName() + ": " + caballo.getTiempo() + " ms");
                    break;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCarrera.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        frmInicio.carros[cIndex].setLocation(frmInicio.carros[cIndex].getLocation().x, frmInicio.Carros[cIndex].getLocation().y);
        this.stop();
    }
}
