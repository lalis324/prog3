
package com.mycompany.parcial;


import java.util.Timer;
import java.util.TimerTask;

class Temporizador extends TimerTask {
    private String mensaje;
    private Timer timer;

    public Temporizador(String mensaje, Timer timer) {
        this.mensaje = mensaje;
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println(mensaje);
    }

    public void detener() {
        this.cancel();
    }

    public void reiniciar(long tiempoEspera) {
        this.cancel();
        this.timer.schedule(new Temporizador(mensaje, timer), tiempoEspera);
    }
}
