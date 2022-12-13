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
public class Principal {
    public static void main(String[] args) {
        CalculadoraInt calcI = (x, y) -> x*y;
        engine( calcI );
        engine( (int x, int y) -> x+y );
        engine( (CalculadoraLong)(x, y) -> x+y ); 
    }
    public static void engine(CalculadoraInt calc){
    }
    public static void engine(CalculadoraLong calc){
    }
}
