package ejercicios_programacion;

import java.util.Scanner;

public class t4_ej5 {

	public static void main(String[] args) {
		 try (Scanner teclado = new Scanner(System.in)) {
                                                             
			 String frase;
		        int contador=0;
		        int longitud;
		        do {
		            System.out.print("Ingrese una frase:");
		            frase=teclado.nextLine();
		            longitud=frase.length();
		        }while(longitud>80);
		        for (int contimp=0;contimp<longitud;contimp+=2) {
		        System.out.println("Los caracteres impares son los siguientes: " + frase.charAt(contimp));
		        }
		        for (int contpar=1;contpar<longitud;contpar+=2) {
		            System.out.println("Los caracteres pares son los siguientes: " + frase.charAt(contpar));
   }
  }
 }
}
