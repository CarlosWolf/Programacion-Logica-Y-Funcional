/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Operaciones_Mutable;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
/**
 *
 * @author gokum
 */
public class OpReduccion1 {
    public static void main(String[] args) {
        SortedSet<String> nombres = Empleado.empleados().stream()
                .map(Empleado::getNombre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(nombres);
    }
}
