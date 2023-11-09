import java.util.Random;

public class Carreras {
    
    static Datos[] carros;
    static Random rnd;
    static int[] velocidades = {350, 350, 355, 345};
    static int[] avances = {12, 13, 15, 11};
    
    static public void reiniciar() {
        for (int i = 0; i < carros.length; i++) {
            carros[i].setVelocidad(velocidades[rnd.nextInt(4)]);
            carros[i].setAvance(avances[rnd.nextInt(4)]);
        }
    }
    
    static public void registrarCarro() {
        rnd = new Random();
        carros = new Datos[5];
        
        String[] nombres = {"Mario", "Yoshi", "Princesa Peach",  "Luigi"};
        int[] coordenadasX = {frmInicio.carro1.getLocation().x, frmInicio.carro2.getLocation().x, frmInicio.carro3.getLocation().x, frmInicio.carro4.getLocation().x};
        int[] coordenadasY = {frmInicio.carro1.getLocation().y, frmInicio.carro2.getLocation().y, frmInicio.carro3.getLocation().y, frmInicio.carro4.getLocation().y};
        
        for (int i = 0; i < 5; i++) {
            carros[i] = new Datos(i + 101, coordenadasX[i], coordenadasY[i], 0, 0, nombres[i]);
            carros[i].setVelocidad(velocidades[rnd.nextInt(4)]);
            carros[i].setAvance(avances[rnd.nextInt(4)]);
        }
    }
    
    static void iniciar() {
        for (int i = 0; i < carros.length; i++) {
            HiloCarrera hilo = new HiloCarrera(carros[i].getNombre());
            hilo.start();
        }
    }
}
