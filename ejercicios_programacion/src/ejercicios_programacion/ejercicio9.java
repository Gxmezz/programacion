package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			int n;
			int suma = 0;
			
			System.out.println ("Introduzca un Numero: ");
			n = teclado.nextInt();
			for (int i = 1 ; i < n ; i++)
			       if (n % i == 0)
			           suma=suma+i;
			if(suma==n) {
			    System.out.println ("El numero "+ n +" es perfecto.");
			}
			else {
			    System.out.println ("El numero "+ n +" no es perfecto.");
			}
		}
        
    }
    
}