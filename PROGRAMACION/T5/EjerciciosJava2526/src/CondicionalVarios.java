import java.util.Scanner;

public class CondicionalVarios {

	public static void main(String[] args) {
		//Declaración de variables
		int num1;
		Scanner sc = new Scanner(System.in);
		
		//Petición de datos
		System.out.println("Dime la nota: ");
		num1=sc.nextInt();
		
		if (num1<5 && num1>=0) {
			System.out.println("Insuficiente");
		}
		else if (num1>=5 && num1<6) {
			System.out.println("Suficiente");
		}
		else if (num1>=6 && num1<7) {
			System.out.println("Bien");
		}
		else if (num1>=7 && num1<9) {
			System.out.println("Notable");
		}
		else if (num1>=9 && num1<10) {
			System.out.println("Sobresaliente");
		}
		else if (num1==10) {
			System.out.println("Matricula de Honor");
		}
		else System.out.println("Número fuera de rango");
	}

}
