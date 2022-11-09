package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		try (Scanner teclado = new Scanner(System.in)) {
			int N, contador;
			
			System.out.println("Introduce un número para saber si es un número primo:");
	    	N = teclado.nextInt();

	    	contador = 0;
	    	
	    	 for (int i=2; i < N-1; i++) {
	         	
	    		if ( N % i == 0 ) { contador++; }}
	    		
	    	 	if ( contador>=1 )
	         		System.out.println("El número "+N+" no es un número primo");
	    		else
	         		System.out.println("El número "+N+" es un número primo");
	    			    	 
		}
	}
}
