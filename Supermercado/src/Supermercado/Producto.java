package Supermercado;

public abstract class Producto {
	
	int id;
	String marca;
	String nombre;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Producto(int id, String marca, String nombre) {
		super();
		this.id = id;
		this.marca = marca;
		this.nombre = nombre;
	}
	
	
	
	
	
	

}
