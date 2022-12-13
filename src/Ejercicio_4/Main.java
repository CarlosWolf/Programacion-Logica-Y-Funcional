/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author gokum
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(create().calculate(4, 5));
    }
    
    private static CalculadoraLong create(){
        long var = 201;
        return (x, y) -> x * y;
    }
}
