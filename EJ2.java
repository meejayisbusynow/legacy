package EJ;

import java.util.Scanner;
import java.util.InputMismatchException;

public class EJ2 {
	public static void main(String[] args) {
		int a = 3, i, n, multiplo;
		Scanner reader = new Scanner(System.in);
		try {
			System.out.println("----------------------------------------------");
			System.out.println("Bienvenido a la calculadora de multiplos de 3");
			System.out.println("----------------------------------------------");
			System.out.print("Escriba cuantos multiplos de 3 quiere ver : ");

			n = reader.nextInt();
			System.out.println("----------------------------------------------");

			for (i = 1; i <= n; i++) {

				a = i * 3;

				System.out.println(i + "º (3 x " + i + ") = " + a);
				System.out.println("----------------");

			}
	
		} catch (InputMismatchException e) {
			System.out.println("");
			System.out.println("*_*_*_*_*_*_*_*_*_*¡¡¡¡ERROR!!!*_*_*_*_*_*_*_*_*_*");
			System.out.println("Error: "+e);
			System.out.println("Por favor introduzca un valor numérico la próxima vez.");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("¡GRACIAS POR USAR NUESTRO PROGRAMA!");
		System.out.println("----------------------------------------------");

	}

}
