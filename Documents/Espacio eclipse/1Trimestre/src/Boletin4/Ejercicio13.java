package Boletin4;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero no negativo: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = calcularFactorial(n);
            System.out.println("El factorial de " + n + " es: " + factorial);
        }
        
        scanner.close();
    }

    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    

}
