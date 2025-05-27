package Boletin4;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numero; 
        int suma = 0; 
        System.out.println("Introduce números (ingresa 0 para terminar):");
      
        while (true) {
            numero = scanner.nextInt();
            if (numero == 0) {
                break; // 
            }
            suma += numero; 
        }

        System.out.println("La suma de todos los números ingresados es: " + suma);
        scanner.close(); 
    }
}