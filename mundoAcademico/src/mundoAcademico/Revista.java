package mundoAcademico;

public class Revista extends Publicacion {
	
String issn;	
int volumen;
String editor;

public String getIssn() {
	return issn;
}
public void setIssn(String issn) {
	this.issn = issn;
}
public int getVolumen() {
	return volumen;
}
public void setVolumen(int volumen) {
	this.volumen = volumen;
}
public String getEditor() {
	return editor;
}
public void setEditor(String editor) {
	this.editor = editor;
}


public Revista(int id, String titulo, String fecha, String idioma, String url, String issn, int volumen,
		String editor) {
	super(id, titulo, fecha, idioma, url);
	this.issn = issn;
	this.volumen = volumen;
	this.editor = editor;
}
	


	

}
