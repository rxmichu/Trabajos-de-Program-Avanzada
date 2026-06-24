package mundoAcademico;

public class Libro extends Publicacion {

String isbn;
String editorial;
String numeroPaginas;

public String getIsbn() {
	return isbn;
}
public void setIsbn(String isbn) {
	this.isbn = isbn;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public String getNumeroPaginas() {
	return numeroPaginas;
}
public void setNumeroPaginas(String numeroPaginas) {
	this.numeroPaginas = numeroPaginas;
}


public Libro(int id, String titulo, String fecha, String idioma, String url, String isbn, String editorial,
		String numeroPaginas) {
	super(id, titulo, fecha, idioma, url);
	this.isbn = isbn;
	this.editorial = editorial;
	this.numeroPaginas = numeroPaginas;
}


	
	
	
	
}
