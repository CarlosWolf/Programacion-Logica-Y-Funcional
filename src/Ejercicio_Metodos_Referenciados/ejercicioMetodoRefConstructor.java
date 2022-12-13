/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Metodos_Referenciados;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
/**
 *
 * @author gokum
 */
public class ejercicioMetodoRefConstructor {
    public static void main(String[] args) {
        List<String> numeros = Arrays.asList("10","20","15","25","30","40","6","30");
        getResults(numeros, Integer::new).forEach( ejercicioMetodoRefConstructor::multiplicarPor10 );
    }
    
    public static List<Integer> getResults(List<String> datos, Function<String, Integer> func){
        List<Integer> resultados = new ArrayList<>();
        
        datos.forEach(strNum -> resultados.add(func.apply(strNum)));
        
        return resultados;
    }
    
    public static void multiplicarPor10(int numero){
        System.out.println("El nuevo valor es: " +numero*10);
    }
}
