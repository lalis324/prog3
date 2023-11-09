public class Datos {
    
    private int codigo;
    private int X;
    private int Y;
    private int velocidad;
    private int avance;
    private long tiempo;
    private String nombre;

    public Datos(int codigo, int coorX, int coorY, long tiempo, int velocidad, String nombre) {
        this.codigo = codigo;
        this.X = X;
        this.Y = Y;
        this.tiempo = tiempo;
        this.velocidad = velocidad;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCoorX() {
        return X;
    }

    public void setCoorX(int coorX) {
        this.X = X;
    }

    public int getCoorY() {
        return Y;
    }

    public void setCoorY(int coorY) {
        this.Y = Y;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAvance() {
        return avance;
    }

    public void setAvance(int avance) {
        this.avance = avance;
    }

    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(long tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}