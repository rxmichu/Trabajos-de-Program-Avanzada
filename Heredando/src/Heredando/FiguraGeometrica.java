package Heredando;

public abstract class FiguraGeometrica {

	double centro;
	double area;
	String nombrefigura;
	
	public double getCentro() {
		return centro;
	}
	public void setCentro(double centro) {
		this.centro = centro;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getNombrefigura() {
		return nombrefigura;
	}
	public void setNombrefigura(String nombrefigura) {
		this.nombrefigura = nombrefigura;
	}
	public FiguraGeometrica(double centro, double area, String nombrefigura) {
		this.centro = centro;
		this.area = area;
		this.nombrefigura = nombrefigura;
	}
	
	
	
}
