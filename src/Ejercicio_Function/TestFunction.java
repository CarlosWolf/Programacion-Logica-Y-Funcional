/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Function;
import java.util.function.Function;
/**
 *
 * @author gokum
 */
public class TestFunction {
    public static void main(String[] args) {
        Function<Integer, String> convertidor = x -> Integer.toString(x);
        System.out.println(convertidor.apply(3).length());
        System.out.println(convertidor.apply(30).length());
    }
}
