package Me_gusta_el_arte;

public abstract class ObraArte {
	
String autor;
String nombreObra;
String fechaCompletado; //fecha en la que se completó

public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getNombreObra() {
	return nombreObra;
}
public void setNombreObra(String nombreObra) {
	this.nombreObra = nombreObra;
}
public String getFechaCompletado() {
	return fechaCompletado;
}
public void setFechaCompletado(String fechaCompletado) {
	this.fechaCompletado = fechaCompletado;
}
public ObraArte(String autor, String nombreObra, String fechaCompletado) {
	super();
	this.autor = autor;
	this.nombreObra = nombreObra;
	this.fechaCompletado = fechaCompletado;
}


	

}
