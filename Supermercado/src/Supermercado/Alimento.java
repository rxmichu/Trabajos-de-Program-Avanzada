package Supermercado;

public class Alimento extends Producto {
	
	String fechaVencimiento;
	int lote;
	String alim;
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getLote() {
		return lote;
	}
	public void setLote(int lote) {
		this.lote = lote;
	}
	public String getAlim() {
		return alim;
	}
	public void setAlim(String alim) {
		this.alim = alim;
	}
	public Alimento(int id, String marca, String nombre, String fechaVencimiento, int lote, String alim) {
		super(id, marca, nombre);
		this.fechaVencimiento = fechaVencimiento;
		this.lote = lote;
		this.alim = alim;
	}
	
	
	
	}
	
	
	
	

