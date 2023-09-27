
import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args) {
        Parqueadero parkadero = new Parqueadero();
        parqueadero.op();
    }
}  

class parqueadero {
    private List<Vehiculo> vehiculos;
    private int nVehiculo;

    public parqueadero() {
        vehiculos= new ArrayList<>();
        nVehiculo = 1;
    }

    public void op() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("1. Ingreso de vehículo");
            System.out.println("2. Salida del vehículo");
            System.out.println("3. vehículos de 2 ruedas");
            System.out.println("4.  vehículos de 4 ruedas ");
            System.out.println("5.  cantidad de vehículos ");
            System.out.println("6. Eliminar vehículo");
   

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    Ingresar();
                    break;
                case 2:
                    Salida();
                    break;
                case 3:
                    DosRuedas();
                    break;
                case 4:
                    CuatroRuedas();
                    break;
                case 5:
                    Cantidad();
                    break;
                case 6:
                    eliminar();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
            System.out.println();
        } while (opcion != 0);
        
    
    }
}