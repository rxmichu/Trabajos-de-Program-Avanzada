package Heredando;

public class Circulo extends FiguraGeometrica {

	int radio;
	int diametro;
	int circunferencia;
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public int getCircunferencia() {
		return circunferencia;
	}
	public void setCircunferencia(int circunferencia) {
		this.circunferencia = circunferencia;
	}
	public Circulo(double centro, double area, String nombrefigura, int radio, int diametro, int circunferencia) {
		super(centro, area, nombrefigura);
		this.radio = radio;
		this.diametro = diametro;
		this.circunferencia = circunferencia;
	}
	
	
}
