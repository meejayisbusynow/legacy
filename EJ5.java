package EJ;

import java.util.Scanner;

/**
 * 
 * @author Jaime.G
 *
 */

public class EJ5 {

	public static void main(String[] args) {

		int a = 0, i, j, k, c, d, o, p;
		int fac = 1, op = 0;
		Scanner reader = new Scanner(System.in);
		System.out.println("****BIENVENIDO AL PROGRAMA****");

		do {
			System.out.println();
			System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
			System.out.println("1.- Números Impares.");
			System.out.println("2.- Calcular el factorial.");
			System.out.println("3.- ¿Divisibles?");
			System.out.println("4.- Salir.");
			System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
			do {
				System.out.print("Escoja una opción:");
				a = reader.nextInt();
				System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");

				if (a < 0) {
					System.out.println("inserte un valor entre 1-4");
				}
				if (a > 4) {
					System.out.println("inserte un valor entre 1-4");
				}
			} while (a < 0 && a > 4);

			switch (a) {

			case 1:
				System.out.println("Inserte el intervalo del que quiera calcular sus impares");
				do {
					System.out.print("Primer valor:");
					o = reader.nextInt();
					System.out.print("Segundo valor:");
					p = reader.nextInt();

					if (o > p) {
						System.out.println("El segundo valor tiene que ser mas grande que el primero.");
					}
				} while (o > p);
				System.out.println("");
				System.out.println("NÚMEROS IMPARES DESDE " + o + " HASTA " + p);
				for (i = o; i <= p; i++) {

					if (i % 2 != 0) {
						System.out.println("|" + i + "|");
						System.out.println("----");
					}

				}
				break;
			case 2:
				System.out.print("Inserte el factorial a calcular:");
				k = reader.nextInt();
				for (j = k; j > 0; j--) {

					fac = fac * j;

				}
				System.out.println("");
				System.out.println("El factorial de " + k + " es " + fac);
				fac = 1;
				break;
			case 3:
				System.out.print("Introduzca el dividendo:");
				c = reader.nextInt();
				System.out.print("Introduzca el divisor:");
				d = reader.nextInt();

				if (c % d == 0) {
					System.out.println("");
					System.out.println("Los valores introducidos son divisibles");
				} else {
					System.out.println("");
					System.out.println("Los valores introducidos no son divisibles");
				}
				break;
			case 4:
				System.out.println("");
				System.out.println("");
				System.out.println("----------------------------------------------");
				System.out.println("¡GRACIAS POR USAR NUESTRO PROGRAMA!");
				System.out.println("----------------------------------------------");
				break;

			}

		} while (a != 4);

	}

}
