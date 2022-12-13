/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 *
 * @author gokum
 */
public class CrearStreams3 {
    public static void main(String[] args) {
        IntStream numStream = Arrays.stream(
            new int[]{1,2,3,4,5,6,7,8,9}
        );
        numStream.forEach(System.out::println);
        
        Stream<String> nombres = Arrays.stream(new String[]{"Juan","Pedro"});
        nombres.forEach(System.out::println);
        
        Set<String> lenguajesSet = new HashSet<>();
        lenguajesSet.add("C++");
        lenguajesSet.add("C++");
        lenguajesSet.add("C++");
        
        Stream<String> lenguajeStream = lenguajesSet.stream();
        lenguajeStream.forEach(System.out::println);
    }
}
