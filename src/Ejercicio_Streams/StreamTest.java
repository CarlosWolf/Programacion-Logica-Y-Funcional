/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
/**
 *
 * @author gokum
 */
public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        Stream<Integer> numStream = numeros.stream();
        
        int suma = numStream.filter( (n) -> n%2 == 1 )
                .map( n -> n*n )
                //.reduce(0, (n1,n2) -> n1+n2 );
                .reduce(0, Integer::sum );
        
        System.out.println("La suma de los numeros impares es: "+suma);
    }
}
