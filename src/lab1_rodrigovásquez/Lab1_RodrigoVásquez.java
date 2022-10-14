package lab1_rodrigovásquez;
/**
 *
 * @author Rui
 */

import java.util.Scanner;

public class Lab1_RodrigoVásquez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner gate = new Scanner(System.in);
        
        System.out.println("-- Bienvendio al sistema de calculo de promedio --");
        System.out.print("Ingrese su nombre: "); //Se ingresa el nombre del usuario
        String nombre = gate.nextLine();
        
        //Se ingresas las notas de las cuatro clases
        System.out.print("Ingrese la nota final de la primera clase: ");
        double primeraClase = gate.nextDouble();
        
        System.out.print("Ingrese la nota final de la segunda clase: ");
        double segundaClase = gate.nextDouble();
                
        System.out.print("Ingrese la nota final de la tercera clase: ");
        double terceraClase = gate.nextDouble();
        
        System.out.print("Ingrese la nota final de la cuarta clase: ");
        double cuartaClase = gate.nextDouble();
        
        //Se calcula el promedio 
        double sumaClase = primeraClase + segundaClase + terceraClase + cuartaClase;
        double promedio = sumaClase / 4; 
        
        //Se imprime el calculo del promedio
        System.out.println("---- " + nombre + " el promedio de las cuatro clases es: " + promedio);
    }
    
}
