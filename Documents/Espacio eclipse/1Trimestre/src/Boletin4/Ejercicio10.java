package Boletin4;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main1(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numero;

       
        do {
            System.out.print("Introduce un número entero positivo: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número válido. Inténtalo de nuevo.");
                scanner.next(); 
            }
            numero = scanner.nextInt();
        } while (numero <= 0);

       
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += (numero + i);
        }

        System.out.println("La suma de los 100 números siguientes a " + numero + " es: " + suma);
    }
}
    