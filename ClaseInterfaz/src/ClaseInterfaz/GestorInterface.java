package ClaseInterfaz;
import java.util.Scanner;
public class GestorInterface {

	public static void main(String[] args) {
		
		
	Perro perrito = new Perro("Lucky", 7, "Golden");	
	Dinosaurio dino = new Dinosaurio("Rita", 285, "Triceraptops");

	int opcion;
	Scanner lector = new Scanner(System.in);
	

	do {
	System.out.println("Bienvenido al menú");
	System.out.println("1. Dar de comer al perro");
	System.out.println("2. Dar de comer al dinosaurio");
	System.out.println("3. Hacer dormir al perro");
	System.out.println("4. Hacer dormir al Dinosaurio");
	System.out.println("5. Salir");
		
		
	opcion = lector.nextInt();
			
	switch (opcion) {	
	
	case 1: {
	perrito.comer();
	break;
	}
	
	case 2: {
	dino.comer();	
	break;
		
	}
	case 3: {
	perrito.dormir();
	break;
	}
	
	case 4:{
		dino.dormir();
		break;
	}
	}
	
	}while(opcion !=5);
	}
	
}

