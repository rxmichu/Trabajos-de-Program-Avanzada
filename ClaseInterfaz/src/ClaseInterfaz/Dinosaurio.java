package ClaseInterfaz;

public class Dinosaurio implements acciones {

	@Override
	public void comer() {
	System.out.println("El dinosaurio acaba de comer 20 kilos de carne");	
	
	}

	@Override
	public void dormir() {
	System.out.println("No se sabe");	
		
	}
	
	String nombre;
	int edad;
	String especie;
	public Dinosaurio(String nombre, int edad, String especie) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
	}
	

}
