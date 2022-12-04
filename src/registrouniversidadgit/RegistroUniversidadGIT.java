package registrouniversidadgit;

import java.util.Scanner;

public class RegistroUniversidadGIT {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        Operaciones op = new Operaciones();

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

            switch (opcion) {
                case 1:
                    op.registrarNuevosEstudiantes();
                    break;
                case 2:
                    op.listarNotasDefinitivas();
                    break;
                case 3:
                    op.listarPromedioEstudiantes();
                    break;
                case 4:
                    op.listarPromediosNotasDefinitivas();
                    break;
                case 9:
                    System.out.println("\n\t\tFIN DE PROGRAMA");
                    break;
                default:
                    System.out.println("Opción equivocada");
            }

        } while (opcion != 9);

    }

}
