package ejercicios_programacion;

import java.util.Scanner;

public class t4_ej1 {

	public static void main(String[] args) {
		 try (Scanner teclado = new Scanner(System.in)) {
			 String frase;
			 int longitud;
		        
		     System.out.print("Ingrese una frase:");
		     frase=teclado.nextLine();
		     longitud=frase.length();
		        
		     for(int cont=0;cont<=longitud;cont++) {
		         System.out.println(frase.substring(0,cont));
		            
		        }
		    }
		}
}