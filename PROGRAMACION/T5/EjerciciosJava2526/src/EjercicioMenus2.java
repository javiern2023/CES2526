import java.util.Scanner;

public class EjercicioMenus2 {

	public static void main(String[] args) {
		
		int numNotas=0, contador=0;
		double notas, suma=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuántas notas vas a introducir? ");
		numNotas=sc.nextInt();
		
		while(numNotas>contador) {
			System.out.println("Dime la nota: ");
			notas=sc.nextDouble();
			suma=suma+notas;
			contador++;
		}
		System.out.println("La nota media es: "+(suma/numNotas));
	}

}
