package registrouniversidadgit;

import java.util.Scanner;

public class Operaciones {

    //Nombre de las Asignaturas están predefinidas.
    private static final String[] ASIGNATURAS = new String[]{"Matematicas",
        "Historia", "Ciencias", "Literatura", "Informatica"};
    //Array de Estudiantes
    private static Estudiante[] estudiantes;

    private static Scanner teclado = new Scanner(System.in);

    public void registrarNuevosEstudiantes() {

        //Inicializamos array de Estudiantes
        estudiantes = new Estudiante[2];

        //Por cada Estudiante, registraremos 5 Asignaturas, con 3 notas parciales
        for (int est = 0; est < estudiantes.length; est++) {
            System.out.println("\n\nRegistrando Estudiante #" + (est + 1));
            System.out.print("Nombre: ");
            String nombre = teclado.nextLine();
            //Registramos Estudiante en el array
            estudiantes[est] = new Estudiante(nombre);

            //Para este Estudiante, registramos ahora 5 Asignaturas
            for (int asig = 0; asig < ASIGNATURAS.length; asig++) {
                //Construimos la Asignatura, tomando el nombre del array predefinido
                Asignatura asignatura = new Asignatura(ASIGNATURAS[asig]);

                //Ahora, hay que pedir 3 notas parciales para esta Asignatura
                System.out.println("\nNotas parciales de " + ASIGNATURAS[asig]);
                for (int i = 0; i < 3; i++) {
                    System.out.print("Parcial #" + (i + 1) + ": ");
                    int parcial = Integer.parseInt(teclado.nextLine());
                    //Registramos parcial en la Asignatura, indicando la posicion donde debe registrarse
                    asignatura.registrarNotaParcial(parcial, i);
                }

                /*
				 * Ya tenemos Asignatura con las 3 notas parciales.
				 * La registramos en el Estudiante, indicando la posición donde registrarse
                 */
                estudiantes[est].registrarAsignatura(asignatura, asig);
            }
            //Aqui termina el bucle para registrar 5 Asignaturas.
            //Ahora se volverá a repetir el ciclo para otro Estudiante, hasta completar los 5
        }
    }
    
    public void listarNotasDefinitivas() {
        if (estudiantes == null) {
            System.out.println("No hay Estudiantes registrados.");
        } else {
            System.out.println("\n\tNOTAS DEFINITIVAS POR ESTUDIANTES");
            //Recorremos cada Asignatura
            for (int asig = 0; asig < ASIGNATURAS.length; asig++) {
                System.out.println("\n- Asignatura: " + ASIGNATURAS[asig]);
                //Recorremos cada Estudiante para obtener su nota en la Asignatura actual
                for (Estudiante estu : estudiantes) {
                    System.out.println("Nombre: " + estu.getNombre());
                    System.out.println("Nota Definitiva: " + estu.getNotaDeAsignatura(asig));
                }
            }
        }
    }
    
    public void listarPromedioEstudiantes() {
        if (estudiantes == null) {
            System.out.println("No hay Estudiantes registrados.");
        } else {
            System.out.println("\n\tPROMEDIO GENERAL POR ESTUDIANTES");
            //Recorremos Estudiantes y les pedimos su promedio
            for (Estudiante estu : estudiantes) {
                System.out.println("\nNombre: " + estu.getNombre());
                System.out.println("Promedio General: " + estu.getPromedioGeneral());
            }
        }
    }
    
    public void listarPromediosNotasDefinitivas() {
        if (estudiantes == null) {
            System.out.println("No hay Estudiantes registrados.");
        } else {
            System.out.println("\n\tPROMEDIOS NOTAS DEFINITIVAS");
            //Recorremos Asignaturas
            for (int asig = 0; asig < ASIGNATURAS.length; asig++) {
                System.out.println("\nAsignatura: " + ASIGNATURAS[asig]);
                /*
				 * Por cada Asignatura, sumamos las notas definitivas de los
				 * 5 Estudiantes. Con esta suma, luego calcularemos el promedio
                 */
                int sumaNotas = 0;
                for (Estudiante estu : estudiantes) {
                    sumaNotas += estu.getNotaDeAsignatura(asig);
                }
                //Tenemos la suma, calculamos promedio
                System.out.println("Promedio de notas: " + (sumaNotas / estudiantes.length));
            }
        }
    }
    
    
    
}
