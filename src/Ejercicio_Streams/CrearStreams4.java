/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Streams;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
/**
 *
 * @author gokum
 */
public class CrearStreams4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        
        IntStream streamChars = entrada.chars();
        
        streamChars.filter( n -> !Character.isDigit( (char)n ) && !Character.isWhitespace( (char)n ) )
                .forEach( n -> System.out.print( (char)n ) );
        
        System.out.println("\n");
        
        String str = "HTML, CSS, JAVASCRIPT, C++, C#, PHP";
        Pattern.compile(", ").splitAsStream(str).forEach(System.out::println);
    }
}
