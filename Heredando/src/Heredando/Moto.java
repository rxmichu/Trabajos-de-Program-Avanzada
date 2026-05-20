package Heredando;

public class Moto extends Vehiculo {

	String marcaMoto;
	int velocmaxmoto;
	String categlibreta;

	public String getMarcaMoto() {
		return marcaMoto;
	}

	public void setMarcaMoto(String marcaMoto) {
		this.marcaMoto = marcaMoto;
	}

	public int getVelocmaxmoto() {
		return velocmaxmoto;
	}

	public void setVelocmax(int velocmaxmoto) {
		this.velocmaxmoto = velocmaxmoto;
	}

	public String getCateglibreta() {
		return categlibreta;
	}

	public void setCateglibreta(String categlibreta) {
		this.categlibreta = categlibreta;
	}

	public Moto(String color, String matricula, int year, String marcaMoto, int velocmaxmoto, String categlibreta) {
		super(color, matricula, year);
		this.marcaMoto = marcaMoto;
		this.velocmaxmoto = velocmaxmoto;
		this.categlibreta = categlibreta;
	}




	
	
	}
	
