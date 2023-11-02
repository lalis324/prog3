
package lab66;


public class Lab66 {
    
    public static void main(String[] args) {

    
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
}