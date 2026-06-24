package BobContruye;

public class Casa extends Edificio {
	
String barrio;
int numHabitacion;
String propietario;

public String getBarrio() {
	return barrio;
}
public void setBarrio(String barrio) {
	this.barrio = barrio;
}
public int getNumHabitacion() {
	return numHabitacion;
}
public void setNumHabitacion(int numHabitacion) {
	this.numHabitacion = numHabitacion;
}
public String getPropietario() {
	return propietario;
}
public void setPropietario(String propietario) {
	this.propietario = propietario;
}

public Casa(String nombre, int numHabitantes, int numero, String barrio, int numHabitacion, String propietario) {
	super(nombre, numHabitantes, numero);
	this.barrio = barrio;
	this.numHabitacion = numHabitacion;
	this.propietario = propietario;
}




}
