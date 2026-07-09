package ClaseInterfaz;

public class Perro implements acciones {

	@Override
	public void comer() {
		System.out.println("El perro comio 20 gramos de carne");
		
	}

	@Override
	public void dormir() {
	 System.out.println("El perro esta durmiendo 9 horas");	
		
	}
	
	String nombre;
	int edad;
	String raza;
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Perro(String nombre, int edad, String raza) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.raza = raza;
	}
	
	
	

}
