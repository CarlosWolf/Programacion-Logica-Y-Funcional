/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Consumer;
import java.util.List;
import java.util.function.Consumer;
/**
 *
 * @author gokum
 */
public class OperacionEstudiantes {
    public void aceptaTodos(List<Estudiante> estudiantes, Consumer<Estudiante> cons){
        
        estudiantes.forEach( estudiante -> {
            cons.accept(estudiante);
        });
    }
}
