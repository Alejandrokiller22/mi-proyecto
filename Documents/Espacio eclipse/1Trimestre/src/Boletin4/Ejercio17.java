package Boletin4;

import java.util.Scanner;

public class Ejercio17 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Introduce un número: ");
	        int numero = scanner.nextInt(); 
	        int suma = 0; 

	      
	        for (int i = 1; i <= numero; i++) {
	            if (i % 2 != 0) {
	                suma += i; 
	            }
	        }

	        System.out.println("La suma de los números impares hasta " + numero + " es: " + suma);
	        scanner.close(); 
	    }
	}