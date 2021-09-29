package EJ;
import java.util.Scanner;
/**
 * 
 * @author Jaime.G
 *
 */

public class EJ4 {
	
	public static void main(String[] args) {
		
		int a=0,edad,empleados=0;
		int edades=0;
		double media;
		String nombre=" ";
		Scanner reader=new Scanner(System.in);
		Scanner name=new Scanner(System.in);
		
		System.out.println("****BIENVENIDO AL PROGRAMA****");
		
		do {
			
			
				
				System.out.println("----------------------------------");
				System.out.println("1.-Registro de empleados.");
				System.out.println("2.-Edad media de los empleados.");
				System.out.println("----------------------------------");
				System.out.print("Escoja una opción :");
				a=reader.nextInt();
				
		
			
			
			switch(a) {
			
			case 1:
				do {
					edad=0;
					System.out.println("----------------------------------");
					System.out.print("Escriba el nombre del empleado:");
					nombre=name.nextLine();
				
					
					System.out.print("Escriba la edad del empleado:");
					edad=reader.nextInt();
				
					
					if(edad<18) {
						System.out.println("");
						System.out.println("Porfavor ingrese un trabajador que sea mayor de edad");
					}
					if(edad>67) {
						System.out.println("");
						System.out.println("Porfavor ingrese un trabajador que no sea octogenario");
					}
					
					
				}while(edad<18 || edad>67);
				empleados++;
				edades=edad+edades;
				break;
			case 2:
				System.out.println("");
				System.out.println("Has ingresado un numero total de "+empleados+" empleados.");
				media=edades/empleados;
				System.out.printf("Entre todos hacen una media de %.0f años.",media);
				break;
			
			
			}
		
		}while(a!=2);
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("¡GRACIAS POR USAR NUESTRO PROGRAMA!");
		System.out.println("----------------------------------------------");

		
	}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


