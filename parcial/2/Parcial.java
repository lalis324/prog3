import java.util.Timer;
import java.util.TimerTask;

class Temporizador extends TimerTask {
    private String mensaje;
    private int tiempoEspera;
   
    public Temporizador(String mensaje, int tiempoEspera) {
        this.mensaje = mensaje;
        this.tiempoEspera = tiempoEspera;
    }

    @Override
    public void run() {
        System.out.println(mensaje);
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }
}