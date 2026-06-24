package mundoAcademico;

public abstract class Publicacion {

int id;
String titulo;
String fecha;
String idioma;
String url;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public String getIdioma() {
	return idioma;
}
public void setIdioma(String idioma) {
	this.idioma = idioma;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}


public Publicacion(int id, String titulo, String fecha, String idioma, String url) {
	super();
	this.id = id;
	this.titulo = titulo;
	this.fecha = fecha;
	this.idioma = idioma;
	this.url = url;
}


	
	
}
