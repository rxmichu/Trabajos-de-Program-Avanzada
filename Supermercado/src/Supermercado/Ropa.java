package Supermercado;

public class Ropa extends Producto {
	
	String tipoTextil; //material de la ropa
	int talle;
	String color;
	public String getTipoTextil() {
		return tipoTextil;
	}
	public void setTipoTextil(String tipoTextil) {
		this.tipoTextil = tipoTextil;
	}
	public int getTalle() {
		return talle;
	}
	public void setTalle(int talle) {
		this.talle = talle;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Ropa(int id, String marca, String nombre, String tipoTextil, int talle, String color) {
		super(id, marca, nombre);
		this.tipoTextil = tipoTextil;
		this.talle = talle;
		this.color = color;
	}
	
	
	

}
