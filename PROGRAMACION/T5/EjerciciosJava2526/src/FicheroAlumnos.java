import java.io.*;
import java.util.Scanner;

public class FicheroAlumnos {

    private final String FICHERO = "alumnos.txt";

    public void crearFichero() {
        File fichero = new File(FICHERO);

        try {
            if (!fichero.exists()) {
                fichero.createNewFile();
                System.out.println("Fichero creado.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero");
        }
    }

    public void añadirAlumno(Scanner sc) {
        try {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            if (existeAlumno(nombre)) {
                System.out.println("El alumno ya existe.");
                return;
            }

            System.out.print("Nota: ");
            String nota = sc.nextLine();

            FileWriter fw = new FileWriter(FICHERO, true);
            fw.write(nombre + ";" + nota + "\n");
            fw.close();

            System.out.println("Alumno añadido.");

        } catch (IOException e) {
            System.out.println("Error al escribir.");
        }
    }

    public void modificarAlumno(Scanner sc) {
        try {
            System.out.print("Nombre del alumno: ");
            String nombre = sc.nextLine();

            File fichero = new File(FICHERO);
            File temp = new File("temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(fichero));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes[0].equalsIgnoreCase(nombre)) {
                    System.out.print("Nueva nota: ");
                    String nuevaNota = sc.nextLine();
                    bw.write(nombre + ";" + nuevaNota + "\n");
                    encontrado = true;
                } else {
                    bw.write(linea + "\n");
                }
            }

            br.close();
            bw.close();

            fichero.delete();
            temp.renameTo(fichero);

            if (encontrado) {
                System.out.println("Nota modificada.");
            } else {
                System.out.println("Alumno no encontrado.");
            }

        } catch (IOException e) {
            System.out.println("Error.");
        }
    }

    public void eliminarAlumno(Scanner sc) {
        try {
            System.out.print("Nombre del alumno: ");
            String nombre = sc.nextLine();

            File fichero = new File(FICHERO);
            File temp = new File("temp.txt");

            BufferedReader br = new BufferedReader(new FileReader(fichero));
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));

            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (!partes[0].equalsIgnoreCase(nombre)) {
                    bw.write(linea + "\n");
                } else {
                    encontrado = true;
                }
            }

            br.close();
            bw.close();

            fichero.delete();
            temp.renameTo(fichero);

            if (encontrado) {
                System.out.println("Alumno eliminado.");
            } else {
                System.out.println("Alumno no encontrado.");
            }

        } catch (IOException e) {
            System.out.println("Error.");
        }
    }

    public void mostrarTodos() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FICHERO));
            String linea;

            System.out.println("\n--- LISTA DE ALUMNOS ---");

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                System.out.println("Nombre: " + partes[0] + " | Nota: " + partes[1]);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error al leer.");
        }
    }

    public void mostrarAlumno(Scanner sc) {
        try {
            System.out.print("Nombre del alumno: ");
            String nombre = sc.nextLine();

            BufferedReader br = new BufferedReader(new FileReader(FICHERO));
            String linea;
            boolean encontrado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes[0].equalsIgnoreCase(nombre)) {
                    System.out.println("Nombre: " + partes[0] + " | Nota: " + partes[1]);
                    encontrado = true;
                    break;
                }
            }

            br.close();

            if (!encontrado) {
                System.out.println("Alumno no encontrado.");
            }

        } catch (IOException e) {
            System.out.println("Error.");
        }
    }

    public boolean existeAlumno(String nombre) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FICHERO));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");

                if (partes[0].equalsIgnoreCase(nombre)) {
                    br.close();
                    return true;
                }
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error.");
        }

        return false;
    }
}
