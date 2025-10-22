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
		
		/*System.out.println("""
                ==========================
                Seleccione una opción:
                1.- Cuadrado
                2.- Rectángulo
                3.- Triángulo
                4.- Círculo
                5.- Salir
                ==========================
                """);

        System.out.print("Opción: ");
        opcion = sc.nextInt();*/
		
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
		
		switch (opcion) {
        case 1 -> {
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = sc.nextDouble();
            double area = lado * lado;
            System.out.println("Área del cuadrado = " + area);
        }
        case 2 -> {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = sc.nextDouble();
            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = sc.nextDouble();
            double area = base * altura;
            System.out.println("Área del rectángulo = " + area);
        }
        case 3 -> {
            System.out.print("Ingrese la base del triángulo: ");
            double base = sc.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = sc.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("Área del triángulo = " + area);
        }
        case 4 -> {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = sc.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("Área del círculo = " + area);
        }
        case 5 -> System.out.println("Saliendo del programa...");
        default -> System.out.println("Opción no válida, intente de nuevo.");
    }
		
	}

}
