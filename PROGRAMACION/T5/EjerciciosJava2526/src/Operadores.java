import java.text.DecimalFormat;
import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		// Creación de variables
		double num1, num2, num3, suma;
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		double num = 9.55678543;
		System.out.println(df.format(num));
		
		
		// Petición de datos por teclado
		System.out.print("Dime el primer número: ");
		num1 = sc.nextDouble();
		System.out.print("Dime el segundo número: ");
		num2 = sc.nextDouble();
		System.out.print("Dime el tercer número: ");
		num3 = sc.nextDouble();
		
		suma = num1 + num2 + num3;
		
		// Mostrar resultados
		System.out.println("La suma de "+num1+" mas "+num2+" mas "+num3+" es "+(num1+num2-num3));
		System.out.println("La resta de "+num1+" menos "+num2+" menos "+num3+ " es "+(num1-num2-num3));
		System.out.println("La multiplicacion de "+num1+" por "+num2+" por "+num3+" es "+(num1*num2*num3));
		System.out.println("La division de "+num1+" entre "+num2+" es "+(num1/num2));

		//Operadores númericos
		// +, -, *, /, %
	}

}
