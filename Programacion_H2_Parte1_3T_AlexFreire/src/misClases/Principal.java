package misClases;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
    	try {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n------ MENÚ ------");
            System.out.println("1 – Ver películas");
            System.out.println("2 – Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ConexionCine.mostrarPeliculas();
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 2);
       
        sc.close();  
        }catch(Exception e) {
        	System.out.println("Solo se pueden elegir numeros.");
        	Principal.main(args);
        }
    }
}
