package Me_gusta_el_arte;

public class Escultura extends ObraArte {

String material;
String objetoRepresentado;	
int transcursoTiempo; // tiempo que tomo


public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public String getObjetoRepresentado() {
	return objetoRepresentado;
}
public void setObjetoRepresentado(String objetoRepresentado) {
	this.objetoRepresentado = objetoRepresentado;
}
public int getTranscursoTiempo() {
	return transcursoTiempo;
}
public void setTranscursoTiempo(int transcursoTiempo) {
	this.transcursoTiempo = transcursoTiempo;
}
public Escultura(String autor, String nombreObra, String fechaCompletado, String material, String objetoRepresentado,
		int transcursoTiempo) {
	super(autor, nombreObra, fechaCompletado);
	this.material = material;
	this.objetoRepresentado = objetoRepresentado;
	this.transcursoTiempo = transcursoTiempo;
}



}
