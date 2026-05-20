package Heredando;

public abstract class Vehiculo {

	String color;
	String matricula;
	int year;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Vehiculo(String color, String matricula, int year) {
		this.color = color;
		this.matricula = matricula;
		this.year = year;
	}

}
