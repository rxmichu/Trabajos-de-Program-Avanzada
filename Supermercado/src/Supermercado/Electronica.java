package Supermercado;

public class Electronica extends Producto {
	
	String sistemOp;
	String usoAparato;
	String tipoAlimentacion;
	public String getSistemOp() {
		return sistemOp;
	}
	public void setSistemOp(String sistemOp) {
		this.sistemOp = sistemOp;
	}
	public String getUsoAparato() {
		return usoAparato;
	}
	public void setUsoAparato(String usoAparato) {
		this.usoAparato = usoAparato;
	}
	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}
	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}
	public Electronica(int id, String marca, String nombre, String sistemOp, String usoAparato,
			String tipoAlimentacion) {
		super(id, marca, nombre);
		this.sistemOp = sistemOp;
		this.usoAparato = usoAparato;
		this.tipoAlimentacion = tipoAlimentacion;
	}
	
	
	

}
