/**
 * Este programa generara una tabla de multiplicar del numero que le digas
 * siempre que sea igual o menor que el de 10
 */
package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio2 {
    public static void main (String[] args) {
    	try (Scanner teclado = new Scanner(System.in)) {
    		int N;
    		
    	System.out.println("Ingresa un numero del que quieras ver su trabla de multiplicar");
    	System.out.println("La tabla de multiplicar sera del 1 al 10");
    	N=teclado.nextInt(); 
    	
    	if (N>10) {
    	System.out.println("La tabla no puede ser mayor que la del numero 10"); }
    	
    	else {
        System.out.println("TABLA DE MULTIPLICAR DEL NÚMERO "+N);
        
    		for (int i=1;
    			 i<=10;
    			 i++)
    	
    	System.out.println(N+"  *  "+i+"  =  "+N*i); }
    			
    	}
    }
}