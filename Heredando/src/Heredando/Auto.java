package Heredando;

public class Auto extends Vehiculo {
	
	String marcaAuto;
	String tipomotor;
	int velocmaxauto;
	
	
	public String getMarcaAuto() {
		return marcaAuto;
	}
	public void setMarcaAuto(String marcaAuto) {
		this.marcaAuto = marcaAuto;
	}
	public String getTipomotor() {
		return tipomotor;
	}
	public void setTipomotor(String tipomotor) {
		this.tipomotor = tipomotor;
	}
	public int getVelocmaxauto() {
		return velocmaxauto;
	}
	public void setVelocmaxauto(int velocmaxauto) {
		this.velocmaxauto = velocmaxauto;
	}
	public Auto(String color, String matricula, int year, String marcaAuto, String tipomotor, int velocmaxauto) {
		super(color, matricula, year);
		this.marcaAuto = marcaAuto;
		this.tipomotor = tipomotor;
		this.velocmaxauto = velocmaxauto;
	}
}

