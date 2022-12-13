/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Supplier;
import java.util.function.Supplier;
/**
 *
 * @author gokum
 */
public class SupplierTest {
     public static void main(String[] args) {
        Supplier<String> i = () -> "Wolf";
        System.out.println("El dato es: " +i.get());
    }
}
