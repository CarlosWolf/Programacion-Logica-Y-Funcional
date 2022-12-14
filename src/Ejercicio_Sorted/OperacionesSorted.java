/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Sorted;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author gokum
 */
public class OperacionesSorted {
    public static void main(String[] args) {
        System.out.println("Empleados ordenados alfabeticamente: ");
        List<Empleado> empleados = Empleado.empleados();
        
        empleados.stream().sorted().forEach( emp -> System.out.println(emp.getNombre()));
        
        System.out.println("\nEmpleados ordenados por edad: ");
        empleados.stream()
                .sorted( new Comparator<Empleado>(){
                    @Override
                    public int compare(Empleado emp1, Empleado emp2){
                        return emp1.getEdad() - emp2.getEdad();
                    }
                }).forEach( emp -> System.out.println(emp.getNombre() +" " +emp.getEdad()));
        
        System.out.println("\nEmpleados ordenados por salario: ");
        empleados.stream()
                .filter( emp -> emp.getEdad() > 25)
                .sorted( (emp1, emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos()) )
                .forEach( emp -> System.out.println(emp.getNombre() +" " +emp.getIngresos()));
    }
}
