/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_BiPredicate;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
/**
 *
 * @author gokum
 */
public class Principal {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = Arrays.asList(
                new Empleado("Juan",25,7000,"Sistemas"),
                new Empleado("Carlos",25,7000,"Sistemas"),
                new Empleado("Wolf",35,5000,"Marketing"),
                new Empleado("Joshua",30,4000,"Diseño"),
                new Empleado("Montero",29,1500,"Ventas"),
                new Empleado("Perez",27,4000,"Diseño"),
                new Empleado("Keith",25,4000,"Ventas"),
                new Empleado("Johan",27,4000,"Mostrador"),
                new Empleado("Jarry",19,1500,"Ventas")
        );
        
        Evaluador evaluador = new Evaluador();
        
        BiPredicate<Integer,String> primerCriterio = (edad, departamento) -> ( edad>=25 ) && ( departamento.equals("Ventas"));
        BiPredicate<Integer,String> segundoCriterio = (edad, departamento) -> ( edad>=25 ) && ( departamento.equals("Sistemas"));
        BiPredicate<Integer,String> criterio = primerCriterio.or(segundoCriterio);
        
        System.out.println("Empleados de Mostrador o Ventas mayores de 25 años");
        
        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);
        
        listaActualizada.forEach((empleado) -> {
            System.out.println("Nombre: " +empleado.getNombre() + " Edad: " +empleado.getEdad() +" Departamento: " +empleado.getDepartamento());
        });
    }
}
