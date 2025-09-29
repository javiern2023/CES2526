import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaPerimetro {

	public static void main(String[] args) {
		long numeroEntero;
		float numeroDecimal;
		boolean valor=false;
		int opcion;
		char op;
		String nombre;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner (System.in);
		
		//Motrar el menú de opciones
		System.out.println("Selecciones una opción");
		System.out.println("1.- Cuadrado");
		System.out.println("2.- Rectángulo");
		System.out.println("3.- Triángulo");
		System.out.println("4.- Círculo");
		System.out.println("5.- Salir");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: System.out.println("Selecciones una opción");
				System.out.println("A.- Área");
				System.out.println("P.- Perímetro");
				op = sc.next().toUpperCase().charAt(0);
				//nombre = sc.next().toLowerCase();
				switch (op) {
					case 'A':
						break;
					case 'P':
						break;
				}
			break;
			
		case 2: 
			break;
			
		case 3: 
			break;
			
		case 4: 
			break;
			
		case 5: System.out.println("Hasta pronto");
			break;
			
		default: System.out.println("Opcion incorrecta");	
	}

	}

}
