/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author David-pc
 */
package practica9;

public class Practica9 {

    public static void main(String[] args) {
        Alumno alumnos[] = new Alumno[3];
        archivo l = new archivo();
        EscribirArchivo e = new EscribirArchivo();
        l.archivoCSV();
        int z = 0;
        for(int i = 0; i<alumnos.length;i++){
            alumnos[i] = new Alumno();
            for(int j = 0; j< alumnos[0].calificaciones.length ; j++){
                alumnos[i].calificaciones[j] = l.calificaciones[z];
                z++;
            }
            alumnos[i].calcularPromedio();
        }
        for (Alumno alumno : alumnos) {
            alumno.printAlumno();
        }
        e.escribirArchivo(alumnos);
    }
}