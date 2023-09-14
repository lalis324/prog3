
public class Estudiante {
    int codigo;
    String nommbre; 
    String correo; 
    int semestre;
    
    public Estudiante(int codigo, String nommbre,String correo, int semestre) {
        this.codigo = codigo;
        this.nommbre = nommbre;
        this.semestre = semestre;
        this.correo=correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNommbre() {
        return nommbre;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
}
