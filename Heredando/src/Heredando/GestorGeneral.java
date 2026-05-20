package Heredando;

public class GestorGeneral {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Negro", "BA673D", 2025, "Chevrolet", "Electrico", 200);
		System.out.println("Matricula auto:");
		System.out.println(auto1.getMatricula());

		Alumno alumno1 = new Alumno("Mia", "Bergara", 58167385, 7, "Vespertino", 5);
		System.out.println("Nombre de alumno:");
		System.out.println(alumno1.getNombre());

		Triangulo triangulo1 = new Triangulo(4.5, 11.2, "Triangulo", "Obtuso", "Isoceles", 16.7);
		System.out.println("Clasificacion por lados del triangulo:");
		System.out.println(triangulo1.getClasiflados());
		
		Moto moto1 = new Moto("Rojo", "DA210F2", 2023, "Ninja", 160, "G3");
		System.out.println("Velocicdad maxima de la moto:");
		System.out.println(moto1.getVelocmaxmoto());
		
		Profesor profesor1 = new Profesor("Ramiro","Sosa", 5963582, 35.000, "Programacion Avanzada", 8);
		System.out.println("Ingresos del profesor:");
		System.out.println(profesor1.getIngresos());
		
		Director director1 = new Director("Pablo", "Castillo", 45862574, 46.000, 12.000, "Domingo");
		System.out.println("Dia libre del director:");
		System.out.println(director1.getDialibre());
		

	}

}
