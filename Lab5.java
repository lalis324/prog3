public class Lab5{
    private String procedencia;
    private String fechaAtencion;
    private String sexo;
    private int edad;
    private String diagnostico;
    private String eapb;

    public Lab5 (String procedencia, String fechaAtencion, String sexo, int edad, String diagnostico, String eapb) {
        this.procedencia = procedencia;
        this.fechaAtencion = fechaAtencion;
        this.sexo = sexo;
        this.edad = edad;
        this.diagnostico = diagnostico;
        this.eapb = eapb;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public String getFechaAtencion() {
        return fechaAtencion;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getEapb() {
        return eapb;
    }
}
