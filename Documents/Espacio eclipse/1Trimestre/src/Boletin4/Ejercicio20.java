package Boletin4;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double[] calificaciones = new double[10];

        while (contador < 10) {
            System.out.print("Ingresa la calificación " + (contador + 1) + ": ");
            calificaciones[contador] = scanner.nextDouble();
            suma += calificaciones[contador];
            contador++;
        }

    
        double promedio = suma / 10;
        System.out.println("El promedio es: " + promedio);

      
        int superiores = 0;
        contador = 0; 

        while (contador < 10) {
            if (calificaciones[contador] > promedio) {
                superiores++;
            }
            contador++;
        }

        System.out.println("Número de calificaciones superiores al promedio: " + superiores);
        scanner.close();
    }
}