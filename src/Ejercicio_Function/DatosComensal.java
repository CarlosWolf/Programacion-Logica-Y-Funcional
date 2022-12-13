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
public class DatosComensal {
    public static Object getDatoComensal(Comensal com, Function<Comensal, Object> func){
        return func.apply(com);
    }
    
    public static void main(String[] args) {
        Comensal com1 = new Comensal("Carlos", 256.2, 5);
        
        String nombreCom = (String)getDatoComensal(com1, x -> x.getNombre());
        int mesa = (int)getDatoComensal(com1, x -> x.getMesa());
        
        System.out.println("El nombre del comensal es: " +nombreCom);
        System.out.println("La mesa es: " +mesa);
    }
}
