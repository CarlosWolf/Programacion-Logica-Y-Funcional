/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Ordenar;
import java.util.Comparator;
/**
 *
 * @author gokum
 */
public class OrdenadorPersonaPorId implements Comparator<Persona>{
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getIdPersona() - o2.getIdPersona();
    }
}
