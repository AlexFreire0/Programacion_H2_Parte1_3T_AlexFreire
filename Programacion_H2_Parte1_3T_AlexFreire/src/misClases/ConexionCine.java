package misClases;
import java.sql.*;

public class ConexionCine {
public static void mostrarPeliculas() {
		
		try {
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3307/cine_alexfreire", "root", "");
			
			Statement miStatement =miConexion.createStatement();
			
			ResultSet miResultSet=miStatement.executeQuery("SELECT titulo, director, anyo, c.nombre AS categoria, duracion FROM peliculas JOIN Categoria c ON categoria = c.id;");
			
			while(miResultSet.next()){
				System.out.println("Título: " + miResultSet.getString("titulo"));
				System.out.println("Director: " + miResultSet.getString("director"));
				System.out.println("Año: " + miResultSet.getString("anyo"));
				System.out.println("Categoría: " + miResultSet.getString("categoria"));
				System.out.println("Duración: " + miResultSet.getInt("duracion") + " minutos");
				System.out.println("---------------------------");
			}
			
		}catch(Exception e){
			System.out.println("Error al conectar");
			e.printStackTrace();
		}
	}

}
