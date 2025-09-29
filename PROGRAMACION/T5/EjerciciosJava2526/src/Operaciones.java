import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		//Declaración de variables
		int nota;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la nota que has sacado en programación");
		nota = sc.nextInt();
		
		if(nota<5 && nota>0) {
			System.out.println("SUSPENSO");
		}
		else if(nota==5) {
			System.out.println("APROBADO");
		}
		else if(nota==6) {
			System.out.println("BIEN");
		}
		else if(nota>=7 && nota <9) {
			System.out.println("NOTABLE");
		}
		else if(nota==9) {
			System.out.println("SOBRESALIENTE");
		}
		else if(nota>10 || nota<0) {
			System.out.println("Nota incorrecta");
		}
		else System.out.println("MATRICULA DE HONOR");
		
		
		
		//1.- Pedir tres números por teclado e indicar cuál es el mayor y cuál el menor
		//2.- Dado un número por teclado indicar si es par o impar
		//3.- Dada una nota por teclado, sin decimales, poner la nota correspondiente en texto
		// 1-4 SUSPENSO
		// 5 APROBADO
		// 6 BIEN
		// 7-8 NOTABLE
		// 9 SOBRESALIENTE
		// 10 MATRICULA DE HONOR
		
		

	}

}
