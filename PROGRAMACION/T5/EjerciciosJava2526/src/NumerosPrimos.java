import java.util.Scanner;

public class NumerosPrimos {
	
	public static void main(String[] args) {
		//Declaración de variables
		int num;
		Scanner sc = new Scanner(System.in);
		
		//Petición de datos
		System.out.println("Dime el numero a comprobar");
		num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("El numero "+num+" es par");
		}
		else {
			System.out.println("El numero "+num+" es impar");
		}
	}
}
