import java.util.Scanner;

public class PeticionDatos {

	public static void main(String[] args) {
		// Variables
		String nombre, apellido1, apellido2;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Dime tú nombre: ");
		nombre = sc.nextLine();
		System.out.print("Dime tú primer apellido: ");
		apellido1 = sc.nextLine();
		System.out.print("Dime tú segundo apellido: ");
		apellido2 = sc.nextLine();
		
		
		
		System.out.println("Tu nombre completo es: "+nombre+" "+apellido1+" "+apellido2);

	}

}
