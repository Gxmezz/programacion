/**
 * Este programa va a sumar todos los numeros enteros comprendidos entre los valores
 * A y B, y filtraremos para que A <= B. 
 */

package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio1 {
    public static void main (String[] args) {
    	try (Scanner teclado = new Scanner(System.in)) {
    		int a, b;
    		int suma=0;
    		
    	System.out.println("Ingresa el valor a");
    		a=teclado.nextInt(); 
	    System.out.println("Ingresa el valor b, que sea mayor o igual que a");
	    	b=teclado.nextInt(); 
	    	
	    if(a>b) {
	        System.out.print("Los números introducidos no son válidos, ");
	        System.out.println(" B debe ser mayor o igual que a."); }

	    else {
	    	for (int contador=a+1; //En esta linea creamos la variable contador y le decimos que al principio del bucle sea igual que a+1
	    			 contador<b; //Aqui le decimos que continue si es menor el resultado que b
	    			 contador++) //Significa que va sumando de 1 en 1
	    
	    	suma=suma+contador;

	    	System.out.println("La suma de los numeros enteros comprendidos entre a y b es "+suma); }
	    } 
    }
}
