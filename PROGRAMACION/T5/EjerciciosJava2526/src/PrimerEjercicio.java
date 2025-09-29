import java.util.Scanner;

public class PrimerEjercicio {

	public static void main(String[] args) {
		/* El alumno o alumna se llama .....
		 * con dni ..... y móvil .....
		 * tiene una nota en programación de ....
		 * 
		 * Una vez modificada la nota tiene un .....
		 * */
		//Declaración de varaibles
		String nombre, apellidos, movil, dni;
		double nota;
		final double MEDIA = 6;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime tu nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tus apellidos: ");
		apellidos = sc.nextLine();
		System.out.print("Dime tu dni: ");
		dni = sc.nextLine();
		System.out.print("Dime tu movil: ");
		movil = sc.nextLine();
		System.out.print("Dime tu nota de programación: ");
		nota = sc.nextDouble();
		
				
		// Mostrar por pantalla
		System.out.println ("El alumno "+nombre+" "+apellidos);
		System.out.println ("con dni "+dni+" y movil "+movil);
		System.out.println ("tiene una nota en programación de "+nota);
		
		nota = 9.9;
		System.out.println ("su nueva nota en programación es de "+nota);

	}

}
