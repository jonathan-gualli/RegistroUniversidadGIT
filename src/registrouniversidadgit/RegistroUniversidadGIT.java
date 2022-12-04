package registrouniversidadgit;

import java.util.Scanner;

public class RegistroUniversidadGIT {
       
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("\n\t\tMENU UNIVERSIDAD");
            System.out.println("\t\t---- -----------\n");
            System.out.println("[1] -- Registrar nuevos Estudiantes");
            System.out.println("[2] -- Listar notas definitivas de Asignaturas por cada Estudiante");
            System.out.println("[3] -- Listar promedio general de cada Estudiante");
            System.out.println("[4] -- Listar promedio de nota definitiva de todos los Estudiantes por Asignatura");
            System.out.println("[9] -- TERMINAR PROGRAMA");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(teclado.nextLine());
        } while (opcion != 9);

    }

}
