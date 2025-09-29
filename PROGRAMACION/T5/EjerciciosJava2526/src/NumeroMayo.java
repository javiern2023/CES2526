import java.util.Scanner;

public class NumeroMayo {

	public static void main(String[] args) {
		// Declaración de variables
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		// Petición de datos
		System.out.print("Dame el primer numero: ");
		num1 = sc.nextInt();
		System.out.print("Dame el segundo numero: ");
		num2 = sc.nextInt();
		System.out.print("Dame el tercer numero: ");
		num3 = sc.nextInt();
		
		// Comparación de los números
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("El numero "+num1+ " es el mayor");
			}
			else System.out.println("El numero "+num3+" es el mayor");
		}
		else {
			if (num2 > num3) {
				System.out.println("El numero "+num2+ " es el mayor");
			}
			else {
				if (num1==num2 && num2==num3) {
					System.out.println("Los números son iguales");
				}
				else System.out.println("El numero "+num3+" es el mayor");
			}
		}
		
	}

}
