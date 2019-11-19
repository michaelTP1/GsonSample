package dad.javafx.gson;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;



public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean aux = true;
		Persona p = new Persona();
		System.out.println("introducir datos con el siguiente formato:\nNombre\nApellidos\nEdad\n");

		while (aux) {
			try {
				
				p.setNombre(scanner.nextLine());
				p.setApellidos(scanner.nextLine());
				p.setEdad(scanner.nextInt());
				aux = false;
			} catch (Exception InputMismatchException) {
				System.out.println("Error al introducir los datos, int�ntelo de nuevo\n\n");

			}

		}
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
	scanner.close();

	}
}
