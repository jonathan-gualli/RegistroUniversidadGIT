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
    private String nom;

    public Estudiante() {
    }

    public Estudiante(String nombre) {
        this.nom = nombre;
    }

    public String getNombre() {
        return nom;
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
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
