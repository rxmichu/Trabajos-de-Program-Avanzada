package Heredando;

public class Profesor extends Persona{

	double ingresos;
	String materia;
	int numclases;

	public double getIngresos() {
		return ingresos;
	}

	public void setIngresos(double ingresos) {
		this.ingresos = ingresos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getNumclases() {
		return numclases;
	}

	public void setNumclases(int numclases) {
		this.numclases = numclases;
	}

	public Profesor(String nombre, String apellido, int ci, double ingresos, String materia, int numclases) {
		super(nombre, apellido, ci);
		this.ingresos = ingresos;
		this.materia = materia;
		this.numclases = numclases;
	}

	
}
