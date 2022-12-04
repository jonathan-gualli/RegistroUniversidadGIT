/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registrouniversidadgit;

/**
 *
 * @author Ordenador
 */
public class asignatura {
    

    //cada asignatura tiene tres notas parciales
    private int[] parciales = new int[3];
    private String nombre;

    public asignatura(String nombre) {
        this.nombre = nombre;
    }

    public asignatura() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    Registra una nota parcial en la posición del array que 
    se indique.
     */
    public void registrarNotaParcial(int nota, int posicion) {
        parciales[posicion] = nota;
    }

    /*Todas las notas tienen el mismo peso para calcular la nota 
    definitiva. Así que basta con calcular el valor medio de las tres*/
    public int getNotaDefinitiva() {
        int sumaNotas = parciales[0] + parciales[1] + parciales[2];
        return sumaNotas / 3;
    }
    
}
