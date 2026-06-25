package Me_gusta_el_arte;

public class Fotografia extends ObraArte {
	
String tematica;
String formato;
String tipoResolucion; // alt, baja, media

public String getTematica() {
	return tematica;
}
public void setTematica(String tematica) {
	this.tematica = tematica;
}
public String getFormato() {
	return formato;
}
public void setFormato(String formato) {
	this.formato = formato;
}
public String getTipoResolucion() {
	return tipoResolucion;
}
public void setTipoResolucion(String tipoResolucion) {
	this.tipoResolucion = tipoResolucion;
}
public Fotografia(String autor, String nombreObra, String fechaCompletado, String tematica, String formato,
		String tipoResolucion) {
	super(autor, nombreObra, fechaCompletado);
	this.tematica = tematica;
	this.formato = formato;
	this.tipoResolucion = tipoResolucion;
}
	


}
