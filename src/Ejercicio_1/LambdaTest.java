/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author gokum
 */
public class LambdaTest {
    public static void main(String[] args) {
        FunctionTest ft = () -> System.out.println("Hola mundo con interfaces y exp lambda"); 
        LambdaTest objeto = new LambdaTest();
        objeto.miMetodo(ft);
    }
    
    public void miMetodo(FunctionTest parametro){
        parametro.saludar();
    }
}
