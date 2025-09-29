import java.text.DecimalFormat;
import java.util.Scanner;

public class EjercicioMenus {

	public static void main(String[] args) {
		double num1=0, num2=0;
		int opcion;
		DecimalFormat df = new DecimalFormat("#.00");
		Scanner sc = new Scanner (System.in);
		
		//Motrar el menú de opciones
		System.out.println("Selecciones una opción");
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multipliar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Resto");
		System.out.println("6.- Salir");
		opcion = sc.nextInt();
		
		if(opcion>=1 && opcion<=5) {
			System.out.println("Dime el primer numero");
			num1=sc.nextDouble();
			System.out.println("Dime el segundo numero");
			num2=sc.nextDouble();
		}
		// Menú de opciones
		switch (opcion) {
			case 1: System.out.println("La suma es: "+(num1+num2));
				break;
				
			case 2: if (num1>num2) System.out.println("La resta es: "+(num1-num2));
					else System.out.println("La resta es: "+(num2-num1));
				break;
				
			case 3: System.out.println("La multiplicacion es: "+df.format(num1*num2));
				break;
				
			case 4: if (num2==0) System.out.println("Divisor es cero");
					else System.out.println("La division es: "+(num1/num2));
				break;
				
			case 5: if (num2==0) System.out.println("Divisor es cero");
					else System.out.println("El resto es: "+(num1%num2));
				break;
				
			case 6: System.out.println("Hasta pronto");
				break;
				
			default: System.out.println("Opcion incorrecta");	
		}

	}

}
