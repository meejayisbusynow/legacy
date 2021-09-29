package EJ;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ1 {
	public static void main(String[] args) {
		int r;
		double PI = Math.PI;
		double p, a;

		

		try {
			Scanner reader = new Scanner(System.in);

			System.out.println("Introduzca el radio del circulo a calcular. (cm)");

			r = reader.nextInt();

			p = 2 * PI * r;
			a = PI * Math.pow(r, 2);
			System.out.println("");

			System.out.printf("El perímetro del círculo sería : %.2f cm", p);
			System.out.println("");
			System.out.printf("El área del círculo sería : %.2f cm2", a);
			System.out.println("");
		} catch (InputMismatchException e) {
			System.out.println("¡¡¡¡¡¡ERROR!!!!!");
			System.out.println("Error: " + e);

			System.out.println("Por favor introduzca un valor numérico la próxima vez.");

		}

		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("¡GRACIAS POR USAR NUESTRO PROGRAMA!");
		System.out.println("----------------------------------------------");
	}

}
