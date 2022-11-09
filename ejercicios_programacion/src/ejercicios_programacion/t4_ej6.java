package ejercicios_programacion;

import java.util.Scanner;

public class t4_ej6 {

	public static void main(String[] args) {
		 try (Scanner teclado = new Scanner(System.in)) {
			 
			 String frase;
		        String frase2;
		        int longitud;
		        int contcons=0;
		        int contvoc=0;
		        int contnum=0;
		        int num=0;
		        
		        do {
		            System.out.print("Ingrese una frase:");
		            frase=teclado.nextLine();
		            longitud=frase.length();
		        }while(longitud>80);
		        frase2=frase.toLowerCase();
		        for (int cont=0;cont<longitud;cont++) {
		            char caracter=frase.charAt(cont);
		            num=caracter;
		            if(num!=32) {
		            if(num>=48&&num<=57) {
		            contnum++;
		            }else if (num==97||num==101||num==105||num==111||num==117) {
		                contvoc++;
		            }
		            else {contcons++;}
		        };
		        
		        }
		        System.out.print("Hay "+ contnum + " numeros, " + contvoc + " vocales " + " y " + contcons + " consonantes.");
		    }
		}
}