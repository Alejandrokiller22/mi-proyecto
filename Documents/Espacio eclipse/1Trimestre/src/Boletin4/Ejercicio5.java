package Boletin4;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int combinacionCorrecta = 1234; 
        int intentos = 4; 
        boolean acceso = false; 

        System.out.println("Introduce la combinación de 4 cifras para abrir la caja fuerte:");

        while (intentos > 0) {
            int combinacionIngresada = scanner.nextInt(); 
            if (combinacionIngresada == combinacionCorrecta) {
                acceso = true; 
                break; 
            } else {
                intentos--; 
                System.out.println("Lo siento, esa no es la combinación. Te quedan " + intentos + " intentos.");
            }
        }

        if (acceso) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente.");
        } else {
            System.out.println("Has agotado todos los intentos. La caja fuerte permanece cerrada.");
        }

        scanner.close(); 
    }
}
	

