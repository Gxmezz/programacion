package ejercicios_programacion;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			int n;
			int contador = 1;
			int sumpar=0;
			int sumimpar=0;
			
			do {
			    System.out.print("Ingresa un numero: ");
			    n = teclado.nextInt();
			    if(contador%2==0) {
			    sumpar=sumpar+n;
			    }
			    else {
			    sumimpar=sumimpar+n;
			    }
			contador++;
			}
			while(n!=0);
			System.out.print("La suma de los numeros en posicion par es "+ sumpar +" y la de los numeros en posicion impar "+ sumimpar);
		}
    }
    
}