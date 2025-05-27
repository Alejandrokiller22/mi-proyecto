package Boletin4;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número n: ");
	        int n = scanner.nextInt();

	        int a = 0, b = 1;
	        System.out.println("Serie de Fibonacci hasta " + n + ":");
	        
	        for (int i = 0; a <= n; i++) {
	            System.out.print(a + " ");
	            int siguiente = a + b;
	            a = b;
	            b = siguiente;
	        }
	        
	        scanner.close();
	    }
	}