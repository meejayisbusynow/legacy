package EJ;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ3 {
	public static void main(String[] args) {
		
		int edad,resta;
		String nombre="";
		String apellidos="";
		Scanner reader= new Scanner(System.in);
		Scanner name= new Scanner(System.in);
		
		try {
			System.out.print("Introduzca su edad :");
			
			edad=reader.nextInt();
			
			
			if(edad<18) {
				
				resta= 18-edad;
				
				System.out.println("Le faltan "+resta+" años para ser mayor de edad.");
				
			}else {
				System.out.print("Introduzca su nombre :");
				nombre=name.nextLine();
				System.out.print("Introduzca sus apellidos:");
				apellidos=name.nextLine();
				System.out.println("");
				
				System.out.println(nombre+" "+apellidos+" usted es mayor de edad, tiene "+edad+" años.");
			}
		} catch (InputMismatchException e) {
			System.out.println("");
			System.out.println("*_*_*_*_*_*_*_*_*_*¡¡¡¡ERROR!!!*_*_*_*_*_*_*_*_*_*");
			System.out.println("Error: "+e);
			System.out.println("");
			System.out.println("Recuerde que le estamos pidiendo su edad. \nLa próxima vez introduzca un valor numérico.");
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------");
		System.out.println("¡GRACIAS POR USAR NUESTRO PROGRAMA!");
		System.out.println("----------------------------------------------");
		
	}

}
