package Mails;

import java.util.Scanner;

public class GestorD {

	public static void main(String[] args) {

		Owner owner1 = new Owner();
		Encargado encargado1 = new Encargado();
		Empleados empleado1 = new Empleados();
		
		int opcion;
		Scanner lector = new Scanner(System.in);

		do {
			System.out.println("Bienvenido al menú:");
			System.out.println("Seleccione el tipo de cargo que tiene: ");
			System.out.println("1. Dueño");
			System.out.println("2. Encargado");
			System.out.println("3. Empleado");
			System.out.println("4. Salir del sistema ");
			opcion = lector.nextInt();

			switch (opcion) {
			case 1: {
			System.out.println("Desea enviar mail a encargado?:");
			System.out.println("1. Si");
			System.out.println("2. No");
			int opcionOwner = lector.nextInt();
			if (opcionOwner == 1) {
			owner1.mandar();
			System.out.println("a encargado. \n");
			} 
			else {
			System.out.println("Volviendo al menú... \n");	
	
			}
				
				break;
			}
			case 2: {
				
				System.out.println("Elija a quien desea enviarle el mail: ");
				System.out.println("1. Dueño");
				System.out.println("2. Empleado");
				int opcionMail = lector.nextInt();
				if (opcionMail == 1) {
					encargado1.mandar();
					System.out.println("a dueño.");
				} else {
				encargado1.mandar();
				System.out.println("a empleado. \n");	
				}

				break;
			}
			
			case 3: {
				System.out.println("Desea enviar mail a encargado?:");
				System.out.println("1. Si");
				System.out.println("2. No");
				int opcionEnc = lector.nextInt();
				if (opcionEnc == 1) {
				owner1.mandar();
				System.out.println("a encargado. \n");
				} 
				else {
				System.out.println("Volviendo al menú... \n");	
			
				
				}
			}

			}
		} while (opcion != 4);

	}
}
