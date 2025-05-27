package Boletin4;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Introduce el primer número: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Introduce el segundo número: ");
	        int num2 = scanner.nextInt();

	      
	        if (num1 == num2) {
	            System.out.println("Los números deben ser distintos.");
	            return;
	        }

	      
	        int menor = Math.min(num1, num2);
	        int mayor = Math.max(num1, num2);

	        
	        for (int i = menor; i <= mayor; i += 7) {
	            System.out.println(i);
	        }

	        scanner.close();
	    }
	}