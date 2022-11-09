package ejercicios_programacion;

import java.util.Scanner;

public class t4_ej8 {

	public static void main(String[] args) {
		 try (Scanner teclado = new Scanner(System.in)) {
			 
		        String frase;
		        String frase2;
		        int longitud;
		        int num;
		        int cont2=0;
		        
		        do {
		            System.out.println("Ingrese una frase:");
		            frase=teclado.nextLine();
		            longitud=frase.length();
		        }while(longitud>80);
		        frase2=frase.toUpperCase();
		        for (int cont=0;cont<longitud;cont++) {
		            char caracter=frase.charAt(cont);
		            num=caracter+3;
		            char cosa=(char) num;
		            System.out.print(cosa);
		        }
		        
		    }
		}
  }
 

