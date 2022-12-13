/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_BiPredicate;
import java.util.function.BiPredicate;
/**
 *
 * @author gokum
 */
public class TestBiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bp = (x,y) -> x < y;
        
        System.out.println(bp.test(2, 3));
    }
}
