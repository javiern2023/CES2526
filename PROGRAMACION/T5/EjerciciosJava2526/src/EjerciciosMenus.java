import java.util.Scanner;

public class EjerciciosMenus {

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.- SUMAR");
			System.out.println("2.- RESTAR");
			System.out.println("3.- MULTIPLICAR");
			System.out.println("4.- DIVIDIR");
			System.out.println("5.- RESTO");
			System.out.println("6.- SALIR");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				break;
				default: System.out.println("OPCION NO VÁLIDA");
			}
		} while(opcion!=6);

	}

}
