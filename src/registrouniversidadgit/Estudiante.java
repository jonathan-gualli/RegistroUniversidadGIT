/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrouniversidadgit;

/**
 *
 * @author david
 */
public class Estudiante {
    
    private Asignatura[] asignaturas = new Asignatura[5];
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void registrarAsignatura(Asignatura asign, int posicion) {
        asignaturas[posicion] = asign;
    }

    public int getNotaDeAsignatura(int posicion) {
        return asignaturas[posicion].getNotaDefinitiva();
    }

    public int getPromedioGeneral() {
        //Sumamos las notas definitivas de sus asignaturas 
        int sumaNotas = 0;
        for (Asignatura asign : asignaturas) {
            sumaNotas += asign.getNotaDefinitiva();
        }
        // retornamos el promedio
        return sumaNotas / 5;
    }
}
