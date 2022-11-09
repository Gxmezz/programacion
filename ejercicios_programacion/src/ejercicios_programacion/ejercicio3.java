package ejercicios_programacion;

import java.util.Scanner;
/**
 * Este programa determina los divisores propios de un número
 * 
 * @author alu
 *
 */

public class ejercicio3 {
    public static void main (String[] args) {
    	try (Scanner teclado = new Scanner(System.in)) {
    		int N; //numero que vamos a leer
    		
    	System.out.println("Introduce un número del que quieras saber sus divisores propios:");
    	N = teclado.nextInt();

    	if (N<=3)
        	System.out.println(N+" no tiene divisores propios.");
    	
        for (int i=2; i < N-1; i++) {
        	if ( N % i == 0 )
        		System.out.println("El número " + i + " es divisor propio de " + N);
        	}
    	}
    }
}