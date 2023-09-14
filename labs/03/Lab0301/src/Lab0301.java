
import java.util.LinkedList;
import java.util.Queue;


public class Lab0301 {
 static Queue<Registro>regis= new LinkedList<>();
    
    public static void main(String[] args) {
       registro_estudiante();
       registro_asignatura();
       reporte_registro_final();
    }
    public static void registro_estudiante(){
        int codigo = Entrada.readInt("codigo de estudiante");
        String nombre = Entrada.readText("nombre estudaintes");
        String correo = Entrada.readText("correo estudiante");
        int semestre = Entrada.readInt("semestre");
        Estudiante estud = new Estudiante(codigo,nombre,correo,semestre);
        // crear el registro con el codigo del estudiante 
        // luego agregar las asignaturas..
        
        regis.add(new Registro(estud));
        
        
    }
   public static void registro_asignatura(){
        
    }
        
   public static void reporte_registro_final(){
        
    }
}

