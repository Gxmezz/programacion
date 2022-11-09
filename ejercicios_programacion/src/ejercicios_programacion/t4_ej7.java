package ejercicios_programacion;

import java.util.Scanner;

public class t4_ej7 {

	public static void main(String[] args) {
		 try (Scanner teclado = new Scanner(System.in)) {

		String frase;
        int longitud;
        int contnum=0;
        int num=0;
        int contmay=0;
        int contmin=0;
        
        do {
            System.out.print("Introduzca una frase: ");
            frase=teclado.nextLine();
            longitud=frase.length();
        }while(longitud>80);
        for (int cont=0;cont<longitud;cont++) {
            char caracter=frase.charAt(cont);
            num=caracter;
            if(num!=32) {
                if(num>=48&&num<=57) {
                    contnum++;
                }else if (num>=65 && num<=90) {
                    contmay++;
                }
                else {contmin++;}
            }
        }
        System.out.print("Hay " + contnum + " numeros, " + contmay + " mayusculas y " + contmin + " minusculas.");
    }
  }
}