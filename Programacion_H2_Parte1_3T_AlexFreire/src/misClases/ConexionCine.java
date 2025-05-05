package misClases;
import java.sql.*;

public class ConexionCine {
public static void mostrarPeliculas() {
		
		try {
			//conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/cine_alexfreire", "root", "");
			
			Statement miStatement =miConexion.createStatement();
			//codigo sql que se ejecuta
			ResultSet miResultSet=miStatement.executeQuery("SELECT titulo, director, anyo, c.nombre AS categoria, duracion FROM peliculas JOIN Categoria c ON categoria = c.id;");
			//mostramos en cuadrados
			while(miResultSet.next()){
				System.out.println("Título: " + miResultSet.getString("titulo"));
				System.out.println("Director: " + miResultSet.getString("director"));
				System.out.println("Año: " + miResultSet.getString("anyo"));
				System.out.println("Categoría: " + miResultSet.getString("categoria"));
				System.out.println("Duración: " + miResultSet.getInt("duracion") + " minutos");
				System.out.println("---------------------------");
			}
			//cazamos errores.
		}catch(Exception e){
			System.out.println("Error al conectar");
			e.printStackTrace();
		}
	}

}
