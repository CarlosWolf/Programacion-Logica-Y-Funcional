/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author gokum
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        Operaciones op = (num1, num2) -> System.out.println(num1 + num2);
        op.printOperacion(10, 5);
        LambdaTest2 objeto = new LambdaTest2();
        objeto.miMetodo(op, 10, 5);
        objeto.miMetodo( (num1, num2) -> System.out.println( num1 * num2 ), 10, 5);
    }
    
    public void miMetodo(Operaciones op, int num1, int num2){
        op.printOperacion(num1, num2);
    }
}
