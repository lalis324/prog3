
    import java.util.Random;

public class Lab66 {
    
    static auto[] carro;
    static Random rnd;
    static int[] vel;
    
    static public void reiniciar(){
    int[] vel={240,250,255,245};
    int[] ava={13,15,16,14};
     
        carro[0].setVelocidad(vel[rnd.nextInt(0)]);
        carro[1].setVelocidad(vel[rnd.nextInt(1)]);
        carro[2].setVelocidad(vel[rnd.nextInt(2)]);
        carro[3].setVelocidad(vel[rnd.nextInt(3)]);

    }


static void iniciar(){
        
        hilo h1= new hilo(carro[0].getNombre());
        h1.start();
        
        hilo h2= new hilo(carro[1].getNombre());
        h2.start();
        
        hilo h3= new hilo(carro[2].getNombre());
        h3.start();
        
        hilo h4= new hilo(carro[3].getNombre());
        h4.start();
    } 
}
