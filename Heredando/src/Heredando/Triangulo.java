package Heredando;

public class Triangulo extends FiguraGeometrica {

	String clasifangulos;
	String clasiflados;
	double perimetro;

	public String getClasifangulos() {
		return clasifangulos;
	}

	public void setClasifangulos(String clasifangulos) {
		this.clasifangulos = clasifangulos;
	}

	public String getClasiflados() {
		return clasiflados;
	}

	public void setClasiflados(String clasiflados) {
		this.clasiflados = clasiflados;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public Triangulo(double centro, double area, String nombrefigura, String clasifangulos, String clasiflados,
			double perimetro) {
		super(centro, area, nombrefigura);
		this.clasifangulos = clasifangulos;
		this.clasiflados = clasiflados;
		this.perimetro = perimetro;
	}

	

}
