package mundoAcademico;

public class ArticuloCientifico extends Publicacion {

String doi;
String universidad;
String areaEstudio;

public String getDoi() {
	return doi;
}
public void setDoi(String doi) {
	this.doi = doi;
}
public String getUniversidad() {
	return universidad;
}
public void setUniversidad(String universidad) {
	this.universidad = universidad;
}
public String getAreaEstudio() {
	return areaEstudio;
}
public void setAreaEstudio(String areaEstudio) {
	this.areaEstudio = areaEstudio;
}


public ArticuloCientifico(int id, String titulo, String fecha, String idioma, String url, String doi,
		String universidad, String areaEstudio) {
	super(id, titulo, fecha, idioma, url);
	this.doi = doi;
	this.universidad = universidad;
	this.areaEstudio = areaEstudio;
}



	
	
}
