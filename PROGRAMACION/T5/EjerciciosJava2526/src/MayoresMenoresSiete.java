import java.util.Scanner;

public class MayoresMenoresSiete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, mayores=0, menores=0;
		double nota;
		System.out.print("Dime cuántas notas: ");
		numero = sc.nextInt();
		
		for(int i=0;i<numero;i++) {
			System.out.println("Dime la nota a ingresar: ");
			nota = sc.nextDouble();
			
			if(nota<0 && nota>10) System.out.println("Nota introducida incorrecta");
			else if(nota<7 && nota>0) menores++;
			else if(nota>=7) mayores++;
			else if(nota==0) i=numero;
		}
		
	}

}
