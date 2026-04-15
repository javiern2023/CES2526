// Cada línea tendrá el siguiente formato: nombre;nota

import java.io.*;
import java.util.*;

public class GestionAlumnos {

   public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        // Crear objeto
        FicheroAlumnos gestor = new FicheroAlumnos();

        // Crear fichero
        gestor.crearFichero();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Añadir alumno");
            System.out.println("2. Modificar nota");
            System.out.println("3. Eliminar alumno");
            System.out.println("4. Mostrar todos");
            System.out.println("5. Mostrar alumno");
            System.out.println("6. Salir");
            System.out.print("Elige opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    gestor.añadirAlumno(sc);
                    break;
                case 2:
                    gestor.modificarAlumno(sc);
                    break;
                case 3:
                    gestor.eliminarAlumno(sc);
                    break;
                case 4:
                    gestor.mostrarTodos();
                    break;
                case 5:
                    gestor.mostrarAlumno(sc);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 6);

        sc.close();
    }
}