package Heredando;

public class Director extends Persona {

	double sueldo;
	double salariovacacional;
	String dialibre;

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public double getSalariovacacional() {
		return salariovacacional;
	}

	public void setSalariovacacional(double salariovacacional) {
		this.salariovacacional = salariovacacional;
	}

	public String getDialibre() {
		return dialibre;
	}

	public void setDialibre(String dialibre) {
		this.dialibre = dialibre;
	}

	public Director(String nombre, String apellido, int ci, double sueldo, double salariovacacional, String dialibre) {
		super(nombre, apellido, ci);
		this.sueldo = sueldo;
		this.salariovacacional = salariovacacional;
		this.dialibre = dialibre;
	}

}
