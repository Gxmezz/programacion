package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			//define el factorial de un número N como N*(N-1)
        	//(N-2).......32*1. Programa que lea un número N
        	//filtrando que debe ser mayor que cero y calcula
        	//su factorial.

			int n;
			int cont=1;
			int fact=1;
			
			System.out.print("Introduce un numero:");
			n=teclado.nextInt();
			
			while(cont<=n) {
			    fact=fact*cont;
			    cont++;
			}
			System.out.print(fact);
		}
    }
}