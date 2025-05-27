package Boletin4;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        int contadorPositivos = 0; 
	        int contadorNegativos = 0; 

	        System.out.println("Introduce 10 números:");

	        for (int i = 0; i < 10; i++) {
	            int numero = scanner.nextInt(); 

	            if (numero > 0) {
	                contadorPositivos++; 
	            } else if (numero < 0) {
	                contadorNegativos++; 
	            }
	        }

	        System.out.println("Números positivos: " + contadorPositivos);
	        System.out.println("Números negativos: " + contadorNegativos);

	        scanner.close(); 
	    }
	}