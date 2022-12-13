/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author gokum
 */
public class Principal {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Johan",6),
                new Estudiante("Carlos",8),
                new Estudiante("Montero",7),
                new Estudiante("Keith",10),
                new Estudiante("Tommy",5),
                new Estudiante("Juan",8),
                new Estudiante("Jarry",3),
                new Estudiante("Fernanda",4),
                new Estudiante("Contreras",10),
                new Estudiante("Nurmi",5),
                new Estudiante("Chuc",7),
                new Estudiante("Norris",7),
                new Estudiante("Rambo",10)
        );
        
        OperacionEstudiantes op = new OperacionEstudiantes();
        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " +e.getNombre() +" Calificacion: "+e.getCalificacion());
        System.out.println("Estudiantes sin calificacion actualizada");
        op.aceptaTodos(estudiantes, cons1);
        
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
        
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        
        System.out.println("Estudiantes con calificacion actualizada");
        op.aceptaTodos(estudiantes, cons3);
    }
}
