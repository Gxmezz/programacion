package ejercicios_programacion;

import java.util.Scanner;

public class perdida_evaluacion_continua {
    public static void main (String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
			int hF, hT, ID; //Horas faltadas, horas totales.
			hT=256; //modulo_programacion
			
			System.out.println("Ingresa número de horas faltadas");
			    hF=teclado.nextInt(); //usuario escribe su numero de faltas
			System.out.println("Ingresa ID");
			    ID=teclado.nextInt();
			
   if (hF>hT*0.15)
			System.out.print("El alumno con ID " + ID +" ha perdido la Evaluación Continua");
   else if(hF>hT*0.10)
			System.out.print("El alumno con ID " + ID +" ha superado el 10% de horas faltadas, con el 15% perdera el derecho a Evaluación Continua");
   else if(hF>hT*0.05)
			System.out.print("El alumno con ID " + ID +" ha superado el 5% de horas faltadas, con el 15% perdera el derecho a Evaluación Continua");
   else if(hF<hT*0.05)
			System.out.print("El alumno con ID " + ID +" ha faltado menos del 5% de las horas. ¡Sigue asi!");
		}
    
 }
}