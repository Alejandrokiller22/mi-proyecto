package Boletin4;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        System.out.println("Ingrese números (un número negativo para terminar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break; 
            }

            suma += numero;
            contador++;
        }

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los valores introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

        scanner.close();
    }
}