/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Operaciones_Reduccion;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author gokum
 */
public class Empleado {
    private long id;
    private String nombre;
    private double ingresos;
    private Genero genero;
    private int edad;
    
    public static enum Genero{
        HOMBRE, MUJER
    }

    public Empleado(long id, String nombre, double ingresos, int edad, Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.ingresos = ingresos;
        this.genero = genero;
        this.edad = edad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public boolean esHombre(){
        return this.genero == Genero.HOMBRE;
    }
    
    public boolean esMujer(){
        return this.genero == Genero.MUJER;
    }
    
    public static List<Empleado> empleados(){
        Empleado emp1 = new Empleado(1,"Keith Moguel",4500,22,Genero.MUJER);
        Empleado emp2 = new Empleado(2,"Chuc Norris ",2500,20,Genero.MUJER);
        Empleado emp3 = new Empleado(3,"Juan Perez",3500,23,Genero.MUJER);
        Empleado emp4 = new Empleado(4,"Carlos Wolf",5000,22,Genero.HOMBRE);
        Empleado emp5 = new Empleado(5,"Frank Cisco",4500,22,Genero.MUJER);
        Empleado emp6 = new Empleado(6,"Tommy Once",5000,22,Genero.HOMBRE);
        Empleado emp7 = new Empleado(7,"Elsa Pito",3500,38,Genero.MUJER);
        Empleado emp8 = new Empleado(8,"Jarry Poter",1500,44,Genero.HOMBRE);
        Empleado emp9 = new Empleado(9,"El Borracho",658.2,28,Genero.HOMBRE);
        Empleado emp10 = new Empleado(10,"La Chalupa",586.6,21,Genero.HOMBRE);
        Empleado emp11 = new Empleado(11,"El Valiente",6984.8,36,Genero.MUJER);
        Empleado emp12 = new Empleado(12,"Las Jaras",245.77,24,Genero.MUJER);
        Empleado emp13 = new Empleado(13,"Gane Loteria",9455.22,50,Genero.HOMBRE);
        
        return Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10,emp11,emp12,emp13);
    }
}
