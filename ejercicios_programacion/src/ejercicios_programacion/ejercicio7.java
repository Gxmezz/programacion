package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio7 {
	 public static void main (String[] args) {
	    	try (Scanner teclado = new Scanner(System.in)) {
	    /*Este programa lee una secuencia de datos de longitud
	     * indefinida de manera que cuando la entrada es 0 para de 
	     * pedir datos. Luego calcula la media de todos e imprime
	     * el mayor y el menor.
	     */
	    	
	    		int contador = 0;
				int suma=0;
				int n;
				
				do {
				    System.out.print("Ingresa un numero: ");
				    n = teclado.nextInt();
				    suma = n + suma;
				    contador++;
				}
				while (n!=0);
				System.out.print("Se han escrito "+ contador +" numeros y su suma es "+ suma);
		}
	 }
}