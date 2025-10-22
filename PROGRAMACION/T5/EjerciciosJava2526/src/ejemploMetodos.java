import java.util.Scanner;

public class ejemploMetodos {

	public static void main(String[] args) {
		// Variables
		int opcion, num1, num2, resultado;
		int numeros [] = {1,2,3};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el primer número: ");
		
		num1=sc.nextInt();
		System.out.print("Dime el segundo número: ");
		num2=sc.nextInt();
						
		opcion=mostrarMenu(sc);
		//menuOpciones(opcion);				
		switch (opcion) {
			case 1: resultado=suma(num1,num2);
					System.out.println("La suma es "+resultado);
				break;
			case 2: System.out.println(numeros[2]);
					resta(numeros);
					System.out.println(numeros[2]);
					//System.out.println("La resta es "+(num1-num2));
				break;
			case 3: //System.out.println("La multiplilcación es "+(num1*num2));
				break;
			case 4: //System.out.println("La división es "+(num1/num2));
				break;
			case 5: //System.out.println("El resto es "+(num1%num2));
				break;
			default: System.out.println("Opción incorrecta");
		}

	}
	
	public static int mostrarMenu(Scanner sc) {
		System.out.println("=== MENÚ DE OPCIONES ===");
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- División");
		System.out.println("5.- Resto");
		System.out.print("Indica qué quieres hacer: ");
		int opcion=sc.nextInt();
		return opcion;
	}
	public static void menuOpciones() {
		
	}
	public static int suma(int num1, int num2) {
		return num1+num2;
	}
	public static void resta(int num []) {
		System.out.println(num[2]);
		num[2]=6;
	}
	public static void multiplicacion() {
		
	}
}

