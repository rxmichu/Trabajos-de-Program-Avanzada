package Heredando;

public class Alumno extends Persona {

	int salon;
	String turno;
	int grado;

	public int getSalon() {
		return salon;
	}

	public void setSalon(int salon) {
		this.salon = salon;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public Alumno(String nombre, String apellido, int ci, int salon, String turno, int grado) {
		super(nombre, apellido, ci);
		this.salon = salon;
		this.turno = turno;
		this.grado = grado;
	}

	
}
